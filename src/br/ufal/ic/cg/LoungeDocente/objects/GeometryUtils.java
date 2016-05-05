package br.ufal.ic.cg.LoungeDocente.objects;

import javax.media.opengl.GL2;

/**
 * @author Durval Pereira
 * @author Erivaldo Lourenço
 * 
 * @version 1.0
 */

public class GeometryUtils {

	public static double[] calculateNormal(double[] p1, double[] p2, double[] p3) {
		double d = p2[0] - p1[0];
		double e = p2[1] - p1[1];
		double f = p2[2] - p1[2];

		double a = p3[0] - p1[0];
		double b = p3[1] - p1[1];
		double c = p3[2] - p1[2];

		double[] normal = { (b * f - c * e), (c * d - f * a), (a * e - d * b) };// 3

		double lenght = Math.pow(
				(normal[0] * normal[0] + normal[1] * normal[1] + normal[2]
						* normal[2]), 0.5);

		normal[0] = normal[0] / lenght;
		normal[1] = normal[1] / lenght;
		normal[2] = normal[2] / lenght;
		return normal;
	}
	
	
	public static void calculatePortalInside(GL2 gl, double[][] pontos,
			double espessura, boolean drawfloor) {
		gl.glBegin(GL2.GL_QUAD_STRIP);
		for (int j = 0; j < pontos.length; j++) {
			double[] vertice1 = new double[] { pontos[j][0], pontos[j][1],
					pontos[j][2] };
			double[] vertice2 = new double[] { pontos[j][0], espessura,
					pontos[j][2] };
			if (j > 0) {
				double[] vertice3 = new double[] { pontos[j - 1][0],
						pontos[j - 1][1], pontos[j - 1][2] };
				gl.glNormal3dv(GeometryUtils.calculateNormal(vertice1,
						vertice2, vertice3), 0);
			}
			if (j % 2 == 0)
				gl.glTexCoord2d(0, 0);
			else
				gl.glTexCoord2d(10, 0);

			gl.glVertex3dv(vertice1, 0);

			if (j % 2 == 0)
				gl.glTexCoord2d(10, 10);
			else
				gl.glTexCoord2d(0, 10);
			gl.glVertex3dv(vertice2, 0);
		}

		if (drawfloor) {
			double[] vertice1 = new double[] { pontos[0][0], pontos[0][1],
					pontos[0][2] };
			double[] vertice2 = new double[] { pontos[0][0], espessura,
					pontos[0][2] };

			double[] vertice3 = new double[] { pontos[pontos.length - 1][0],
					pontos[pontos.length - 1][1], pontos[pontos.length - 1][2] };
			gl.glNormal3dv(
					GeometryUtils.calculateNormal(vertice1, vertice2, vertice3),
					0);
			
			gl.glTexCoord2d(0, 0);
			gl.glVertex3dv(vertice1, 0);
			
			gl.glTexCoord2d(0.3, 0.3);
			gl.glVertex3dv(vertice2, 0);
		}

		gl.glEnd();

	}
}

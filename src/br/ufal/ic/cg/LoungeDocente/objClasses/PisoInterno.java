package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class PisoInterno extends AutoDrawnableObject {

	private int startList;

	public PisoInterno(GL2 gl) {
		super(gl);
		desenhar();
	}

	private void desenhar() {
		startList = gl.glGenLists(5);

		gl.glNewList(startList, GL2.GL_COMPILE); // base inferior/superior
		{
			gl.glBegin(GL2.GL_QUAD_STRIP);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(-88, 0, 0.1f);
				gl.glTexCoord2f(20, 0);gl.glVertex3f(78, 0, 0.1f);
				gl.glTexCoord2f(0, 20);gl.glVertex3f(-88, 150, 0.1f);
				gl.glTexCoord2f(20, 20);gl.glVertex3f(78, 150, 0.1f);
			}
			gl.glEnd();
		}
		gl.glEndList();

	}

	@Override
	protected String getTextureExtension() {
		return "jpg";
	}

	@Override
	protected String getTextureImg() {
		return "internalFloor.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_S,
				GL2.GL_REPEAT);// Repete a textura varias vezes
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_T,
				GL2.GL_REPEAT);

		gl.glCallList(startList);

	}

}

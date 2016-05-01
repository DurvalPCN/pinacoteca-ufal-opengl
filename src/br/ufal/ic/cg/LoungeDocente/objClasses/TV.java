package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class TV extends AutoDrawnableObject {

	private int startList;

	public TV(GL2 gl) {
		super(gl);
		desenhaPorta();
	}

	private void desenhaPorta() {
		startList = gl.glGenLists(5);

		gl.glNewList(startList, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // TV
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-6, 9, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-6, 9, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

	}

	@Override
	protected String getTextureExtension() {
		return "png";
	}

	@Override
	protected String getTextureImg() {
		return "tv.png";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
				
		gl.glPushMatrix();
		{
			gl.glTranslatef(25, 65, 11);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
	}
}

package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class LixeiroVermelho extends AutoDrawnableObject {

	private int startList;

	public LixeiroVermelho(GL2 gl) {
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
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0, 4, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0, 4, 0);
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
		return "red.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(23, 55, 0);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(25, 55, 0);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
	}
}

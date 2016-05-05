package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class LixeiroAmarelo extends AutoDrawnableObject {

	private int startList;

	public LixeiroAmarelo(GL2 gl) {
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

		gl.glNewList(startList+1, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // TV
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(1.5f, 0, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(1.5f, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // PARTE BAIXO
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 4, 0);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(1.5f, 4, 0);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(1.5f, 0, 0);
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
		return "yellow.jpg";
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
			gl.glTranslatef(24.5f, 55, 0);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(23, 55, 0);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(23, 59, 0);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		// parte baixo
		gl.glPushMatrix();
		{
			gl.glTranslatef(23, 55, 1);			
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();
			
	}
}

package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class Bancada extends AutoDrawnableObject {

	private int startList;

	public Bancada(GL2 gl) {
		super(gl);
		desenhaPorta();
	}

	private void desenhaPorta() {
		startList = gl.glGenLists(5);

		gl.glNewList(startList, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // FRENTE
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(15, 0, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(15, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+1, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // FRENTE DIAGONAL
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-4, 5, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-4, 5, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // BARRA
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0, 5, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0, 5, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+3, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // SUPERIOR FRENTE
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 5, 0);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(15, 5, 0);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(15, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+4, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); // SUPERIOR FRENTE
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 10, 0);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-4, 10, 0);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-4, 5, 0);
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
		return "madeira.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		
		// FRENTE HORIZONTAL
		gl.glPushMatrix();
		{
			gl.glTranslatef(0, 80, 0);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();

		// TRAS HORIZONTAL
		gl.glPushMatrix();
		{
			gl.glTranslatef(0, 85, 0);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		// FRENTE DIAGONAL
		gl.glPushMatrix();
		{
			gl.glTranslatef(0, 80, 0);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		

		// BARRA ESQUERDA
		gl.glPushMatrix();
		{
			gl.glTranslatef(-4, 85, 0);			
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();


		// BARRA MEIO
		gl.glPushMatrix();
		{
			gl.glTranslatef(0, 85, 0);			
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();

		// BARRA DIREITA
		gl.glPushMatrix();
		{
			gl.glTranslatef(15, 80, 0);			
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();

		// SUPERIOR HORIZONTAL1
		gl.glPushMatrix();
		{
			gl.glTranslatef(0, 80, 4);			
			gl.glCallList(startList+3);
		}
		gl.glPopMatrix();

		// SUPERIOR DIAGONAL
		gl.glPushMatrix();
		{
			gl.glTranslatef(0, 80, 4);			
			gl.glCallList(startList+4);
		}
		gl.glPopMatrix();

	}
}

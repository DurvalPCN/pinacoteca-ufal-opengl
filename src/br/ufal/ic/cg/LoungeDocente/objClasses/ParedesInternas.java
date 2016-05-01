package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class ParedesInternas extends AutoDrawnableObject {

	private int startList;

	public ParedesInternas(GL2 gl) {
		super(gl);
		desenhar();
	}

	private void desenhar() {
		startList = gl.glGenLists(5);
		gl.glNewList(startList, GL2.GL_COMPILE);// laterais
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(40, 0, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(40, 0, 38.5f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(40, 150f, 38.5f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(40, 150f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();
		
		gl.glNewList(startList+1, GL2.GL_COMPILE);// parede principal
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(25, 0, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(25, 0, 15.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(25, 75.5f, 15.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(25, 75.5f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+3, GL2.GL_COMPILE);// media parede principal
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(25, 0, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(25, 0, 15.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(25, 35.5f, 15.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(25, 35.5f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+4, GL2.GL_COMPILE);// frente/tras media parede principal
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(0, 0, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(0, 0, 15.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(25, 0, 15.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(25, 0, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE);// traseira geral
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, 150f, 0f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-88, 150f, 38.5f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(78, 150f, 38.5f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(78, 150f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+6, GL2.GL_COMPILE);// traseira meio
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, 150f, 0f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-88, 150f, 15.75f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(78, 150f, 15.75f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(78, 150f, 0f);
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
		return "insideWall.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_S,
				GL2.GL_REPEAT);// Repete a textura varias vezes
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_T,
				GL2.GL_REPEAT);

		gl.glPushMatrix();
		{
			gl.glTranslatef(-128, 0, 0);
			gl.glCallList(startList); // lateral esquerda
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(38, 0, 0);
			gl.glCallList(startList); // lateral direita
		}
		gl.glPopMatrix();
			
		gl.glCallList(startList+1); // parede principal direita

		gl.glPushMatrix();
		{
			gl.glTranslatef(-50, 0, 0);
			gl.glCallList(startList+1); // parede principal esquerda
		}
		gl.glPopMatrix();
			
		gl.glCallList(startList+2); // traseira

		gl.glPushMatrix();
		{
			gl.glTranslatef(0, -60, 0);
			gl.glCallList(startList+6); // quebrada no meio
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(-30, 30, 0);
			gl.glCallList(startList+3); // media parede esquerda
			gl.glCallList(startList+4); // media parede esquerda
		}
		gl.glPopMatrix();
			
	}

}

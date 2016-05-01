package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class ParedesExternas extends AutoDrawnableObject {

	private int startList;

	public ParedesExternas(GL2 gl) {
		super(gl);
		desenhaParedes();
	}

	private void desenhaParedes() {
		startList = gl.glGenLists(5);
		
		gl.glNewList(startList, GL2.GL_COMPILE);// laterais
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(40, 0, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(40, 0, 38.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(40, 150.5f, 38.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(40, 150.5f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+1, GL2.GL_COMPILE);// frente esquerda
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(-50, 0, 0f);
				gl.glTexCoord2f(0, 8);gl.glVertex3f(-50, 0, 15.75f);
				gl.glTexCoord2f(14, 8);gl.glVertex3f(28.1f, 0, 15.75f);
				gl.glTexCoord2f(14, 0);gl.glVertex3f(28.1f, 0, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE);// traseira
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(78, 150f, 0f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(78, 150f, 38.5f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-88, 150f, 38.5f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, 150f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+3, GL2.GL_COMPILE);// frente direita
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(-14.2f, 0, 0f);
				gl.glTexCoord2f(0, 8);gl.glVertex3f(-14.2f, 0, 15.75f);
				gl.glTexCoord2f(10, 8);gl.glVertex3f(44, 0, 15.75f);
				gl.glTexCoord2f(10, 0);gl.glVertex3f(44, 0, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+9, GL2.GL_COMPILE);// tampão superior porta
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(-10, 0f, 14.75f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(-10, 0f, 16.75f);
				gl.glTexCoord2f(5, 1);gl.glVertex3f(20, 0f, 16.75f);
				gl.glTexCoord2f(5, 0);gl.glVertex3f(20, 0f, 14.75f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+11, GL2.GL_COMPILE);// primeiro andar frente
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(-112, 0, 0f);
				gl.glTexCoord2f(0, 8);gl.glVertex3f(-112, 0, 14.75f);
				gl.glTexCoord2f(28, 8);gl.glVertex3f(54, 0, 14.75f);
				gl.glTexCoord2f(28, 0);gl.glVertex3f(54, 0, 0f);
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
		return "wall-pina.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_S,
				GL2.GL_REPEAT);// Repete a textura varias vezes
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_T,
				GL2.GL_REPEAT);

		gl.glCallList(startList+9);//tampao portas superior
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(-38, 0, 0);			
			gl.glCallList(startList+1);//frente esquerda
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(34, 0, 0);			
			gl.glCallList(startList+3);//frente esquerda
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(24, 0, 17.75f);			
			gl.glCallList(startList+11);//primeiro andar parede frontal
		}
		gl.glPopMatrix();
	}

}

package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class ParedesPilastrasFrente extends AutoDrawnableObject {
	private int startList;

	public ParedesPilastrasFrente(GL2 gl) {
		super(gl);
		desenhaPiso();
	}

	private void desenhaPiso() {
		startList = gl.glGenLists(5);
		
		gl.glNewList(startList, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// piso interno

			{
				gl.glTexCoord2f(4f, 0f);
				gl.glVertex3f(122, -8.3f, 0); // p1 é p/ direita, p2 é mais perto da parede frontal
				gl.glTexCoord2f(4f, 30f);
				gl.glVertex3f(122, 142.3f, 0); // p1 é p/ direita, p2 é mais perto da parede traseira

				gl.glTexCoord2f(0f, 30f);
				gl.glVertex3f(0, 142.3f, 0);
				gl.glTexCoord2f(0f, 0f);
				gl.glVertex3f(0, -8.3f, 0);

			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+1, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// pilastra meio

			{
				gl.glTexCoord2f(4f, 0f);gl.glVertex3f(166, -12.3f, 0); // p1 é p/ direita, p2 é mais perto da parede frontal
				gl.glTexCoord2f(4f, 30f);gl.glVertex3f(166, 141.3f, 0); // p1 é p/ direita, p2 é mais perto da parede traseira
				gl.glTexCoord2f(0f, 30f);gl.glVertex3f(0, 141.3f, 0);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, -12.3f, 0);

			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// frente pilastra meio

			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(78, -4f, 15.75f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(78, -4f, 17.75f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-88, -4f, 17.75f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, -4f, 15.75f);

			}
			gl.glEnd();
		}
		gl.glEndList();
		
		gl.glNewList(startList+3, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// frente pilastra gigante superior

			{
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(78, -4f, 32.5f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(78, -4f, 38.5f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-88, -4f, 38.5f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, -4f, 32.5f);

			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+4, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// FRENTE/TRÁS PILASTRAS LATERAIS GIGANTES

			{
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-84, -0.1f, 0f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-84, -0.1f, 38.5f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-88, -0.1f, 38.5f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, -0.1f, 0f);

			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+5, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// LATERAIS PILASTRAS LATERAIS GIGANTES

			{
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-88, 0f, 0f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-88, 0f, 38.5f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-88, -4.1f, 38.5f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-88, -4.1f, 0f);

			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+6, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);// FRENTE PILASTRAS MENORES

			{
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-66, -4.1f, 17.75f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-66, -4.1f, 32.5f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-68, -4.1f, 32.5f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-68, -4.1f, 17.75f);

			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+7, GL2.GL_COMPILE);
		{
		gl.glBegin(GL2.GL_POLYGON);// LATERAIS PILASTRAS LATERAIS GIGANTES

		{
			gl.glTexCoord2f(1f, 0f);gl.glVertex3f(-66, 0f, 17.75f);
			gl.glTexCoord2f(1f, 1f);gl.glVertex3f(-66, 0f, 32.5f);
			gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-66, -4.1f, 32.5f);
			gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-66, -4.1f, 17.75f);

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
		return "whiteWall.jpg";
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
			gl.glTranslatef(-88, 8.31f, 15.75f);
			gl.glCallList(startList+1); // pilastra divisora - bottom
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(-88, 8.31f, 17.75f);
			gl.glCallList(startList+1); // pilastra divisora - top
		}
		gl.glPopMatrix();

		gl.glCallList(startList+2); // pilastra divisora - front
				

		gl.glPushMatrix();
		{
			gl.glTranslatef(-88, 8f, 32.5f);
			gl.glCallList(startList+1); // pilastra superior gigante - bottom
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(-88, 8f, 38.5f);
			gl.glCallList(startList+1); // pilastra superior gigante - top
		}
		gl.glPopMatrix();

		gl.glCallList(startList+3); // pilastra divisora - front
		
		
		// PILASTRAS GIGANTES LATERAIS
		// ESQUERDA
		gl.glCallList(startList+4); // trás

		gl.glPushMatrix();
		{
			gl.glTranslatef(0, -4f, 0f);
			gl.glCallList(startList+4); //frente
		}
		gl.glPopMatrix();

		gl.glCallList(startList+5); // trás

		gl.glPushMatrix();
		{
			gl.glTranslatef(4f, 0f, 0f);
			gl.glCallList(startList+5); //frente
		}
		gl.glPopMatrix();

		// DIREITA
		gl.glPushMatrix();
		{
			gl.glTranslatef(162, 0f, 0f);
			gl.glCallList(startList+4); // trás
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(162, -4f, 0f);
			gl.glCallList(startList+4); // frente
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(162f, 0f, 0f);
			gl.glCallList(startList+5); //frente
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(166f, 0f, 0f);
			gl.glCallList(startList+5); //frente
		}
		gl.glPopMatrix();

		// PILASTRAS MENORES DOS VIDROS
		// PILASTRA 1
		gl.glCallList(startList+6);
		gl.glCallList(startList+7);
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(-2f, 0f, 0f);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		// PILASTRA 2
		gl.glPushMatrix();
		{
			gl.glTranslatef(18f, 0f, 0f);
			gl.glCallList(startList+6);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(16f, 0f, 0f);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		// PILASTRA 3
		gl.glPushMatrix();
		{
			gl.glTranslatef(36f, 0f, 0f);
			gl.glCallList(startList+6);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(34f, 0f, 0f);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		// PILASTRA 4
		gl.glPushMatrix();
		{
			gl.glTranslatef(54f, 0f, 0f);
			gl.glCallList(startList+6);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(52f, 0f, 0f);
			gl.glCallList(startList+7);
		}
		gl.glPopMatrix();

		
	}

}

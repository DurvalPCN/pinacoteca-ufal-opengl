package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class Pilastras extends AutoDrawnableObject {

	private int startList;

	public Pilastras(GL2 gl) {
		super(gl);
		desenhaParedes();
	}

	private void desenhaParedes() {
		startList = gl.glGenLists(10);
		
		gl.glNewList(startList+6, GL2.GL_COMPILE);// pilastras laterais
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(35, 115.5f, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(35, 115.5f, 10.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(36f, 115.5f, 10.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(36f, 115.5f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();
	
		gl.glNewList(startList+7, GL2.GL_COMPILE);// pilastras laterais
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(35, 116f, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(35, 116f, 10.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(36f, 116f, 10.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(36f, 116f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();
	
		gl.glNewList(startList+8, GL2.GL_COMPILE);// pilastras laterais
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(35, 115.5f, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(35, 115.5f, 10.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(35, 116f, 10.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(35, 116f, 0f);
			}
			gl.glEnd();
		}
		gl.glEndList();
		
		gl.glNewList(startList+9, GL2.GL_COMPILE);// pilastras laterais
		{
			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0, 0);gl.glVertex3f(36f, 115.5f, 0f);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(36f, 115.5f, 10.75f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(36f, 116f, 10.75f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(36f, 116f, 0f);
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
		return "goldTxt.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_S,
				GL2.GL_REPEAT);// Repete a textura varias vezes
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_T,
				GL2.GL_REPEAT);
		//gl.glColor3f(1, 1, 1);

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, -39.75f, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(5, -38, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, -36, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(7, -34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(8, -32, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(9, -30, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(10, -28, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(9, -26, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(8, -24, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(7, -22, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, -20, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(5, -18, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, -16, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, -14, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, -12, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, -10, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, -8, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(5, -6, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, -4, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(7, -2, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(8, 0, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(9, 2, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(10, 4, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(11, 6, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(12, 8, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(13, 10, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(14, 12, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(13, 14, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(12, 16, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(11, 18, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(10, 20, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(9, 22, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(8, 24, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(7, 26, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 28, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(5, 30, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(4, 32, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(3, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(1, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-1, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-3, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-5, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-7, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-9, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-11, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-13, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-15, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-17, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-19, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();
		
		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-21, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-23, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-25, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-27, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-29, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-31, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();

		// COMEÇANDO PILASTRAS MENORES
		gl.glPushMatrix();
		{
			gl.glTranslatef(-32.8f, 34, 0);
			gl.glCallList(startList+6); // quebrada meio
			gl.glCallList(startList+7); // quebrada meio
			gl.glCallList(startList+8); // quebrada meio
			gl.glCallList(startList+9); // quebrada meio
		}
		gl.glPopMatrix();
		
	}

}

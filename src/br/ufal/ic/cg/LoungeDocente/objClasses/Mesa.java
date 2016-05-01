package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;
//import com.jogamp.opengl.util.gl2.GLUT;


import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class Mesa extends AutoDrawnableObject {
	private int startList;

	public Mesa(GL2 gl) {
		super(gl);
		desenhaMesa();
	}

	private void desenhaMesa() {
		startList = gl.glGenLists(5);

		gl.glNewList(startList, GL2.GL_COMPILE); // base inferior/superior
		{
			gl.glBegin(GL2.GL_QUAD_STRIP);
			{
				gl.glTexCoord2f(0, 0);
				gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(1, 0);
				gl.glVertex3f(9, 0, 0);
				gl.glTexCoord2f(0, 1);
				gl.glVertex3f(0, 5, 0);
				gl.glTexCoord2f(1, 1);
				gl.glVertex3f(9, 5, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();
		
		gl.glNewList(startList+1, GL2.GL_COMPILE); // bases laterais
		{
			gl.glBegin(GL2.GL_QUAD_STRIP);
			{
				gl.glTexCoord2f(0, 0);
				gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(1, 0);
				gl.glVertex3f(0, 5, 0);
				gl.glTexCoord2f(0, 1);
				gl.glVertex3f(0, 0, 0.5f);
				gl.glTexCoord2f(1, 1);
				gl.glVertex3f(0, 5, 0.5f);
			}
			gl.glEnd();
		}
		gl.glEndList();
	
	gl.glNewList(startList+2, GL2.GL_COMPILE); // base frontal/traseiro
	{
		gl.glBegin(GL2.GL_QUAD_STRIP);
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(9, 0, 0);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0, 0, 0.5f);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(9, 0, 0.5f);
		}
		gl.glEnd();
	}
	gl.glEndList();
	
	gl.glNewList(startList+3, GL2.GL_COMPILE); // pés
	{
		gl.glBegin(GL2.GL_QUAD_STRIP); // base inferior pé
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(0.5f, 0, 0);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0, 0.5f, 0);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(0.5f, 0.5f, 0f);
		}
		gl.glEnd();
		

		gl.glBegin(GL2.GL_QUAD_STRIP); // base superior pé
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0, 0, 3);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(0.5f, 0, 3);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0, 0.5f, 3);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(0.5f, 0.5f, 3);
		}
		gl.glEnd();
		

		gl.glBegin(GL2.GL_QUAD_STRIP); // base esquerda pé
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(0, 0.5f, 0);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0, 0, 3);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(0, 0.5f, 3);
		}
		gl.glEnd();
		

		gl.glBegin(GL2.GL_QUAD_STRIP); // base direita pé
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0.5f, 0, 0);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(0.5f, 0.5f, 0);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0.5f, 0, 3);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(0.5f, 0.5f, 3);
		}
		gl.glEnd();
		

		gl.glBegin(GL2.GL_QUAD_STRIP); // base frontal pé
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(0.5f, 0, 0);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0, 0, 3);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(0.5f, 0, 3);
		}
		gl.glEnd();
		

		gl.glBegin(GL2.GL_QUAD_STRIP); // base traseira pé
		{
			gl.glTexCoord2f(0, 0);
			gl.glVertex3f(0, 0.5f, 0);
			gl.glTexCoord2f(1, 0);
			gl.glVertex3f(0.5f, 0.5f, 0);
			gl.glTexCoord2f(0, 1);
			gl.glVertex3f(0, 0.5f, 3);
			gl.glTexCoord2f(1, 1);
			gl.glVertex3f(0.5f, 0.5f, 3);
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
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(19f, 85f, 3.1f);
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(19f, 85f, 3.6f);
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(19f, 85f, 3.1f);
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(28f, 85f, 3.1f);
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(19f, 85f, 3.1f);
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(19f, 90f, 3.1f);
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();

		gl.glPushMatrix(); // pé esquerdo inferior
		{
			gl.glTranslatef(20f, 85.5f, 0.1f);
			gl.glCallList(startList+3);
		}
		gl.glPopMatrix();		

		gl.glPushMatrix(); // pé esquerdo superior
		{
			gl.glTranslatef(20f, 89f, 0.1f);
			gl.glCallList(startList+3);
		}
		gl.glPopMatrix();

		gl.glPushMatrix(); // pé direito inferior
		{
			gl.glTranslatef(27f, 85.5f, 0.1f);
			gl.glCallList(startList+3);
		}
		gl.glPopMatrix();

		gl.glPushMatrix(); // pé direito superior
		{
			gl.glTranslatef(27f, 89f, 0.1f);
			gl.glCallList(startList+3);
		}
		gl.glPopMatrix();
		
		
	}
}

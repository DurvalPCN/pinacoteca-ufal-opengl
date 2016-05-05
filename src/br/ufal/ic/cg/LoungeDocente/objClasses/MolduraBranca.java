package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class MolduraBranca extends AutoDrawnableObject {

	private int startList;

	public MolduraBranca(GL2 gl) {
		super(gl);
		desenhaPorta();
	}

	private void desenhaPorta() {
		startList = gl.glGenLists(5);

		gl.glNewList(startList, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 1f, 0);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(8, 1f, 0);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(8, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		// MOLDURA LATERAL
		gl.glNewList(startList+1, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 0.5f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0, 1f, 0.5f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0, 1f, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		// MOLDURA FRONTAL/TRASEIRA
		gl.glNewList(startList+2, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON); 
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 0.5f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(8, 0, 0.5f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(8, 0, 0);
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
		return "texturaLum.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		
		// MOLDURAS TRASEIRAS
		gl.glPushMatrix();
		{
			gl.glTranslatef(-18, 15f, 15.5f);	
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 15f, 15.5f);	
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 45f, 15.5f);	
			gl.glCallList(startList);
		}
		gl.glPopMatrix();	
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 75f, 15.5f);	
			gl.glCallList(startList);
		}
		gl.glPopMatrix();

		// MOLDURAS LATERAIS
		gl.glPushMatrix();
		{
			gl.glTranslatef(-18, 15f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(-10, 15f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 15f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(14, 15f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 45f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();	

		gl.glPushMatrix();
		{
			gl.glTranslatef(14, 45f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 75f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(14, 75f, 15f);	
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		// MOLDURAS FRONTAIS
		gl.glPushMatrix();
		{
			gl.glTranslatef(-18, 15f, 15f);	
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 15f, 15f);	
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 45f, 15f);	
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();	
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(6, 75f, 15f);	
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();

	}
	
	
}

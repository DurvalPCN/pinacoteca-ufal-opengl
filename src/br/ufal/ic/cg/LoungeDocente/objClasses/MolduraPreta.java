package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class MolduraPreta extends AutoDrawnableObject {

	private int startList;

	public MolduraPreta(GL2 gl) {
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
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 1.5f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(3f, 0, 1.5f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(3f, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+1, GL2.GL_COMPILE); // TOP/BAIXO
		{

			gl.glBegin(GL2.GL_POLYGON); 
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0.5f, 0f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(3f, 0.5f, 0f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(3f, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE); // LADOS
		{

			gl.glBegin(GL2.GL_POLYGON); 
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 1.5f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0, 0.5f, 1.5f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0, 0.5f, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		// MOLDURAS TV / MOLDURAS TV
		
		gl.glNewList(startList+3, GL2.GL_COMPILE);  // MOLDURA TV TRAS
		{

			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0, 9, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0, 9, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();
		
		gl.glNewList(startList+4, GL2.GL_COMPILE);  // MOLDURA TV LADO
		{

			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 4f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0.5f, 0, 4f);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0.5f, 0, 0);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+5, GL2.GL_COMPILE);  // MOLDURA TV TOPO
		{

			gl.glBegin(GL2.GL_POLYGON);
			{
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(0.5f, 9, 0);
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(0.5f, 9, 0);
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
		return "asfalto.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
				
		gl.glPushMatrix();
		{
			gl.glTranslatef(-20, 29.9f, 7);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(-10, 29.9f, 7);			
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
		
		// BAIXO
		gl.glPushMatrix();
		{
			gl.glTranslatef(-20, 29.4f, 7);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(-10, 29.4f, 7);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();

		// CIMA	
		gl.glPushMatrix();
		{
			gl.glTranslatef(-20, 29.4f, 8.5f);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(-10, 29.4f, 8.5f);			
			gl.glCallList(startList+1);
		}
		gl.glPopMatrix();
		
		// ESQUERDA
		gl.glPushMatrix();
		{
			gl.glTranslatef(-20, 29.4f, 7f);			
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		{
			gl.glTranslatef(-10, 29.4f, 7f);			
			gl.glCallList(startList+2);
		}
		gl.glPopMatrix();
		
		// TV
		// TV
		// TV
		
		// TRÁS
		gl.glPushMatrix();
		{
			gl.glTranslatef(24.5f, 55f, 11);			
			gl.glCallList(startList+3);
		}
		gl.glPopMatrix();

		// LADOS
		gl.glPushMatrix();
		{
			gl.glTranslatef(24, 55f, 11);			
			gl.glCallList(startList+4);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(24, 64f, 11);			
			gl.glCallList(startList+4);
		}
		gl.glPopMatrix();

		// TOPOS
		gl.glPushMatrix();
		{
			gl.glTranslatef(24, 55f, 11);			
			gl.glCallList(startList+5);
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(24, 55f, 7);			
			gl.glCallList(startList+5);
		}
		gl.glPopMatrix();
		
	}
}

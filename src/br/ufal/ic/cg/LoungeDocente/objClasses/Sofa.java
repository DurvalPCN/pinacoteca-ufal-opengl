package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class Sofa extends AutoDrawnableObject {

	private int startList;

	public Sofa(GL2 gl) {
		super(gl);
		desenhar();
	}

	private void desenhar() {
		startList = gl.glGenLists(1);

		gl.glNewList(startList, GL2.GL_COMPILE);
		{
			gl.glBegin(GL2.GL_POLYGON); // bases inferior/superior meio
			{			
				gl.glTexCoord2f(0,0);gl.glVertex3f(0, 0, 0.1f);
				gl.glTexCoord2f(0,1);gl.glVertex3f(0, 7, 0.1f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(8, 7, 0.1f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(8, 0, 0.1f);
			}
			gl.glEnd();
			
		}
		gl.glEndList();

		gl.glNewList(startList+1, GL2.GL_COMPILE);
		{
			gl.glBegin(GL2.GL_POLYGON); // bases esquerda/direita meio
			{			
				gl.glTexCoord2f(0,0);gl.glVertex3f(0, 0, 0.1f);
				gl.glTexCoord2f(0,1);gl.glVertex3f(0, 0, 2.1f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(0, 7, 2.1f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(0, 7, 0.1f);
			}
			gl.glEnd();
			
		}
		gl.glEndList();
		
		gl.glNewList(startList+2, GL2.GL_COMPILE);
		{
			gl.glBegin(GL2.GL_POLYGON); // bases frontal/traseira meio
			{			
				gl.glTexCoord2f(0,0);gl.glVertex3f(0, 0, 0.1f);
				gl.glTexCoord2f(0,1);gl.glVertex3f(0, 0, 2.1f);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(8, 0, 2.1f);
				gl.glTexCoord2f(1, 0);gl.glVertex3f(8, 0, 0.1f);
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
			gl.glTranslatef(-17, 8, 0);	

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 2);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();			

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(8, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 7, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(-17, 16, 0);	

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 2);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();			

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(8, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 7, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(15, 8, 0);	

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 2);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();			

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(8, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 7, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
		}
		gl.glPopMatrix();

		gl.glPushMatrix();
		{
			gl.glTranslatef(15, 16, 0);	

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 2);			
				gl.glCallList(startList);
			}
			gl.glPopMatrix();			

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(8, 0, 0);			
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 0, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(0, 7, 0);			
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
		}
		gl.glPopMatrix();

	}

}

package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class Janelas extends AutoDrawnableObject {
		private int startList;

		public Janelas(GL2 gl) {
			super(gl);
			desenhaBancoBranco();
		}

		private void desenhaBancoBranco() {
			startList = gl.glGenLists(5);

			gl.glNewList(startList, GL2.GL_COMPILE); // JANELAS GRANDES
			{
				gl.glBegin(GL2.GL_QUAD_STRIP);
				{
					gl.glTexCoord2f(1, 0);gl.glVertex3f(6, 0, 0);
					gl.glTexCoord2f(1, 1);gl.glVertex3f(6, 0, 4);
					gl.glTexCoord2f(0, 0);gl.glVertex3f(0, 0, 0);
					gl.glTexCoord2f(0, 1);gl.glVertex3f(0, 0, 4);
				}
				gl.glEnd();
			}
			gl.glEndList();
		
		gl.glNewList(startList+1, GL2.GL_COMPILE);
		{
			gl.glBegin(GL2.GL_QUAD_STRIP); // PORTAS GRANDES
			{
				gl.glTexCoord2f(1, 0);gl.glVertex3f(6, 0, 0);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(6, 0, 10.75f);
				gl.glTexCoord2f(0, 0);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(0, 0, 10.75f);
			}
			gl.glEnd();
		}
		gl.glEndList();

		gl.glNewList(startList+2, GL2.GL_COMPILE); // JANELAS PEQUENAS
		{
			gl.glBegin(GL2.GL_QUAD_STRIP);
			{
				gl.glTexCoord2f(1, 0);gl.glVertex3f(4, 0, 0);
				gl.glTexCoord2f(1, 1);gl.glVertex3f(4, 0, 4);
				gl.glTexCoord2f(0, 0);gl.glVertex3f(0, 0, 0);
				gl.glTexCoord2f(0, 1);gl.glVertex3f(0, 0, 4);
			}
			gl.glEnd();
		}
		gl.glEndList();
	
	gl.glNewList(startList+3, GL2.GL_COMPILE);
	{
		gl.glBegin(GL2.GL_QUAD_STRIP); // PORTAS PEQUENAS
		{
			gl.glTexCoord2f(1, 0);gl.glVertex3f(4, 0, 0);
			gl.glTexCoord2f(1, 1);gl.glVertex3f(4, 0, 10.75f);
			gl.glTexCoord2f(0, 0);gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(0, 1);gl.glVertex3f(0, 0, 10.75f);
		}
		gl.glEnd();
	}
	gl.glEndList();
	
	gl.glNewList(startList+4, GL2.GL_COMPILE);
	{
		gl.glBegin(GL2.GL_QUAD_STRIP); // PORTAS GRANDES DE LADO
		{
			gl.glTexCoord2f(1, 0);gl.glVertex3f(0, 6, 0);
			gl.glTexCoord2f(1, 1);gl.glVertex3f(0, 6, 10.75f);
			gl.glTexCoord2f(0, 0);gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(0, 1);gl.glVertex3f(0, 0, 10.75f);
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

			return "glassWidowSmall.jpg";
		}

		@Override
		public void selfDraw(GL2 gl) {
			texture.enable(gl);
			texture.bind(gl);
			
			// JANELAS DA PORTA PRINCIPAL
			gl.glPushMatrix();
			{
				gl.glTranslatef(2f, -0.1f, 10.75f);
				gl.glCallList(startList);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(8f, -0.1f, 10.75f);
				gl.glCallList(startList);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(14f, -0.1f, 10.75f);
				gl.glCallList(startList);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-4f, -0.1f, 10.75f);
				gl.glCallList(startList);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-10f, -0.1f, 10.75f);
				gl.glCallList(startList);
			}
			gl.glPopMatrix();
		
			// JANELAS GRANDES DA PORTA PRINCIPAL
			gl.glPushMatrix();
			{
				gl.glTranslatef(-10f, -0.1f, 0f);
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();			

			gl.glPushMatrix();
			{
				gl.glTranslatef(-4f, -0.1f, 0f);
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(14f, -0.1f, 0f);
				gl.glCallList(startList+1);
			}
			gl.glPopMatrix();
				
			// JANELAS DO PRIMEIRO ANDAR, LADO ESQUERDO
			// PRIMEIRA REMESSA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-84f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-80f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-76f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-72f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			// SEGUNDA REMESSA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-66f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-62f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-58f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-54f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			// TERCEIRA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-48f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-44f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-40f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-36f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();		
			
			// QUARTA REMESSA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-30f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-26f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-22f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-18f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			// PORTAS DO PRIMEIRO ANDAR, LADO ESQUERDO
			// PRIMEIRA REMESSA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-84f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-80f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-76f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-72f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			// SEGUNDA REMESSA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-66f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-62f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-58f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-54f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			// TERCEIRA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-48f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-44f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-40f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-36f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();		
			
			// QUARTA REMESSA
			gl.glPushMatrix();
			{
				gl.glTranslatef(-30f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-26f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(-22f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(-18f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();
		
			//
			// JANELAS E PORTAS DO LADO DIREITO
			// JANELAS
			gl.glPushMatrix();
			{
				gl.glTranslatef(54f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			gl.glPushMatrix();
			{
				gl.glTranslatef(58f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(62f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(66f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(70f, -0.1f, 28.5f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			
			// PORTAS
			gl.glPushMatrix();
			{
				gl.glTranslatef(54f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(58f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(62f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			{
				gl.glTranslatef(66f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(70f, -0.1f, 17.75f);
				gl.glCallList(startList+3);
			}
			gl.glPopMatrix();


			// JANELAS E PORTAS DO LADO DIREITO ABAIXO
			// JANELAS
			gl.glPushMatrix();
			{
				gl.glTranslatef(54f, -0.1f, 10.75f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			gl.glPushMatrix();
			{
				gl.glTranslatef(58f, -0.1f, 10.75f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(62f, -0.1f, 10.75f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(66f, -0.1f, 10.75f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();

			gl.glPushMatrix();
			{
				gl.glTranslatef(70f, -0.1f, 10.75f);
				gl.glCallList(startList+2);
			}
			gl.glPopMatrix();
			
			// PORTAS DENTRO DO SALAO
			gl.glPushMatrix();
			{
				gl.glTranslatef(24.9f, 9f, 0f);
				gl.glCallList(startList+4);
			}
			gl.glPopMatrix();
			

			gl.glPushMatrix();
			{
				gl.glTranslatef(24.9f, 15f, 0f);
				gl.glCallList(startList+4);
			}
			gl.glPopMatrix();
		}
	}

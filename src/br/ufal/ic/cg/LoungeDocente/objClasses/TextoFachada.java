package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class TextoFachada extends AutoDrawnableObject {

	private int startList;

	public TextoFachada(GL2 gl) {
		super(gl);
		desenhar();
	}

	private void desenhar() {
		startList = gl.glGenLists(1);

		gl.glNewList(startList, GL2.GL_COMPILE);
		{
			gl.glBegin(GL2.GL_POLYGON); // base inferior/superior esquerda
			{			
				gl.glTexCoord2f(0,1);gl.glVertex3f(0, 0, 9f);
				gl.glTexCoord2f(1,1);gl.glVertex3f(45, 0, 9f);
				gl.glTexCoord2f(1,0);gl.glVertex3f(45, 0, 0f);
				gl.glTexCoord2f(0,0);gl.glVertex3f(0, 0, 0f);
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
		return "textoFachada.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);

		gl.glPushMatrix();
		{
			gl.glTranslatef(-5f, -1f, 23.25f);
			gl.glCallList(startList);
		}
		gl.glPopMatrix();
	}
}

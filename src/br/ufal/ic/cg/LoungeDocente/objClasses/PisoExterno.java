package br.ufal.ic.cg.LoungeDocente.objClasses;

import javax.media.opengl.GL2;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class PisoExterno extends AutoDrawnableObject {
	private int startList;

	public PisoExterno(GL2 gl) {
		super(gl);
		desenhaPiso();
	}

	private void desenhaPiso() {
		startList = gl.glGenLists(5);
		gl.glNewList(startList, GL2.GL_COMPILE);
		{

			gl.glBegin(GL2.GL_POLYGON);

			{
				gl.glTexCoord2f(1f, 0f);gl.glVertex3f(400, -200f, -0.1f);
				gl.glTexCoord2f(1f, 1f);gl.glVertex3f(400, 200f, -0.1f);
				gl.glTexCoord2f(0f, 1f);gl.glVertex3f(-400, 200f, -0.1f);
				gl.glTexCoord2f(0f, 0f);gl.glVertex3f(-400, -200f, -0.1f);

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
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_S,
				GL2.GL_REPEAT);// Repete a textura varias vezes
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_WRAP_T,
				GL2.GL_REPEAT);

			gl.glCallList(startList);
	}

}

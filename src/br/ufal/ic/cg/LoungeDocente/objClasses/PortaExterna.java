package br.ufal.ic.cg.LoungeDocente.objClasses;

//import javax.media.opengl.GL;
import javax.media.opengl.GL2;
//import com.jogamp.opengl.util.gl2.GLUT;

import br.ufal.ic.cg.LoungeDocente.objects.AutoDrawnableObject;

/**
 * @author Durval Pereira
 * @author Luís Gustavo
 * 
 * @version 1.0
 */

public class PortaExterna extends AutoDrawnableObject {

	private int startList;
	private int rotationAngle = 0;
	private boolean open = false;
	//private GLUT glut;

	public PortaExterna(GL2 gl) {
		super(gl);
		//glut = new GLUT();
		desenhaPorta();
	}

	private void desenhaPorta() {
		startList = gl.glGenLists(5);

		gl.glNewList(startList, GL2.GL_COMPILE);
		{
			gl.glBegin(GL2.GL_POLYGON);	//porta
			{
				gl.glTexCoord2f(1,0);gl.glVertex3f(7, 0.1f, 0);
				gl.glTexCoord2f(1,1);gl.glVertex3f(7, 0.1f, 10.75f);
				gl.glTexCoord2f(0,1);gl.glVertex3f(1, 0.1f, 10.75f);
				gl.glTexCoord2f(0,0);gl.glVertex3f(1, 0.1f, 0);
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
		return "glassDoor.jpg";
	}

	@Override
	public void selfDraw(GL2 gl) {
		texture.enable(gl);
		texture.bind(gl);
		//gl.glEnable(GL.GL_BLEND);
		//gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);

		gl.glPushMatrix();
		{

			// Portas
			gl.glTranslatef(1f, 0f, 0);

			gl.glPushMatrix();
			{
				gl.glRotatef(rotationAngle, 0f, 0f, 1f);
				gl.glCallList(startList); // desenha porta
			}
			gl.glPopMatrix();
			gl.glPushMatrix();
			{
				gl.glTranslatef(14f, 0, 0);
				gl.glRotatef(180 - rotationAngle, 0f, 0f, 1f);
				gl.glCallList(startList); // desenha porta
			}
			gl.glPopMatrix();
		}
		gl.glPopMatrix();
		//gl.glDisable(GL.GL_BLEND);

	}

	public synchronized void openDoor() {
		if (open)
			return;
		open = true;
		for (int i = 0; i < 70; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rotationAngle++;
		}

	}

	public synchronized void closeDoor() {
		if (!open)
			return;
		open = false;
		for (int i = 0; i < 70; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rotationAngle--;
		}

	}

}

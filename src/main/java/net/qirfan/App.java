package net.qirfan;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import jme3_ext_xbuf.XbufLoader;

/**
 * BoxInBox
 * @author Quazi Irfan
 */
public class App extends SimpleApplication
{
    public static void main( String[] args )
    {
        App app = new App();
        app.showSettings = false;
        app.start();
    }

    public void simpleInitApp() {
        flyCam.setMoveSpeed(35f);

        assetManager.registerLoader(XbufLoader.class, "xbuf");

        makeCubes(25);
    }

    @Override
    public void simpleUpdate(float tpf) {
        super.simpleUpdate(tpf);
    }

    private void makeCubes(int number){
        Node boxNode;
        Vector3f boxLoc;
        Material boxMat;

        for(int i = 0; i<number; i++){
            boxNode = (Node) assetManager.loadModel("Models/world.xbuf");
            boxMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
            boxMat.setColor("Color", ColorRGBA.randomColor());
            boxNode.setMaterial(boxMat);
            rootNode.attachChild(boxNode);
            boxLoc = new Vector3f(FastMath.nextRandomInt(-10, 10),FastMath.nextRandomInt(-10, 10),FastMath.nextRandomInt(-10, 10));
            boxNode.setLocalTranslation(boxLoc);
        }
    }
}

package net.qirfan;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * BoxInBox
 * @author Quazi Irfan
 */
public class App extends SimpleApplication
{
    public static void main( String[] args )
    {
        App app = new App();
//        app.showSettings = false;
        app.start();
    }

    public void simpleInitApp() {
        flyCam.setMoveSpeed(35f);

        makeCubes(25);
    }

    @Override
    public void simpleUpdate(float tpf) {
        super.simpleUpdate(tpf);
    }

    private void makeCubes(int number){
        Geometry boxGeo;
        Vector3f boxLoc;
        Material boxMat;

        for(int i = 0; i<number; i++){
            boxGeo = new Geometry("BoxGeometry", new Box(1,1,1));
            boxMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
            boxMat.setColor("Color", ColorRGBA.randomColor());
            boxGeo.setMaterial(boxMat);
            rootNode.attachChild(boxGeo);
            boxLoc = new Vector3f(FastMath.nextRandomInt(-10, 10),FastMath.nextRandomInt(-10, 10),FastMath.nextRandomInt(-10, 10));
            boxGeo.setLocalTranslation(boxLoc);
        }
    }
}

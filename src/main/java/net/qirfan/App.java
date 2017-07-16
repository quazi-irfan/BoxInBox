package net.qirfan;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
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

        Node world_Node = (Node) assetManager.loadModel("Models/world.xbuf");
        Material world_Material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        world_Material.setColor("Color", ColorRGBA.Blue);
        world_Node.setMaterial(world_Material);
        rootNode.attachChild(world_Node);
    }

    @Override
    public void simpleUpdate(float tpf) {
        super.simpleUpdate(tpf);
    }
}

package com.myapp.casestudy;

public class RenderingSystem {
	
	private WorldObjectRenderer renderer;

	public WorldObjectRenderer getRenderer() {
		return renderer;
	}

	public void setRenderer(WorldObjectRenderer renderer) {
		this.renderer = renderer;
	}
	
	public void render(WorldObject object){
		renderer.render(object);
	}

}

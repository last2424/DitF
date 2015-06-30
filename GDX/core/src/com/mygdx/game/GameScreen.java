package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class GameScreen implements Screen {

	SpriteBatch batch;
	Texture disaytid;
	OrthogonalTiledMapRenderer tmx;
	OrthographicCamera camera;
	TiledMap map;
	World world;
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		map = new TmxMapLoader().load("maps/test.tmx");
		tmx = new OrthogonalTiledMapRenderer(map);
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		world = new World(new Vector2(0, -100), false);
		
	}

	@Override
	public void render(float delta) {
		camera.update();
		batch.begin();
		tmx.setView(camera);
		tmx.render();
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		camera.setToOrtho(false, width /2, height/2);
	}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void hide() {}

	@Override
	public void dispose() {
		disaytid.dispose();
		batch.dispose();
		tmx.dispose();
		map.dispose();
	}

}

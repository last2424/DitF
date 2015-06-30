package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {

	SpriteBatch batch;
	Texture disaytid;
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		disaytid = GameAssetManager.getInstance().get("disaytid.png");
	}

	@Override
	public void render(float delta) {
		batch.begin();
		batch.draw(disaytid, 0, 0);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {}

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
	}

}

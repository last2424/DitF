package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

public class KostilAssetManager extends AssetManager {
	public KostilAssetManager () {
		this(new InternalFileHandleResolver());
	}
	public KostilAssetManager(FileHandleResolver resolver){
	    new AssetManager().setLoader(TiledMap.class, new TmxMapLoader(resolver));
	}
}

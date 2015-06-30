package com.mygdx.game;

import com.badlogic.gdx.Screen;

public enum CustomScreen {

	LOAD_SCREEN {
		@Override
		protected Screen getScreenInstance() {
			return new LoadScreen();
		}
	},
	
	MAIN_MENU {
		@Override
		protected Screen getScreenInstance() {
			return new MenuScreen();
		}
	},
	
	GAME {
		@Override
		protected Screen getScreenInstance() {
			return new GameScreen();
		}
	},
	
	INVENTORY {
		@Override
		protected Screen getScreenInstance() {
			return new InventoryScreen();
		}
	};

	protected abstract Screen getScreenInstance();
	
}

package service;


import service.frete.Especial;
import service.frete.Normal;
import service.frete.Sedex;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	},
	
	ESPECIAL {
		@Override
		public Frete obterFrete() {
			return new Especial();
		}
	};
	
	public abstract Frete obterFrete();
	
}

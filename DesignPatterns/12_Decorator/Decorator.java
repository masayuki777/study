public abstract class Decorator extends SpongeCake {
	protected SpongeCake spongeCake; // この飾り枠がくるんでいる「中身」を指す

	protected Decorator(SpongeCake spongeCake) { // インスタンス生成時に「中身」を引数で指定
		this.spongeCake = spongeCake;
	}
}

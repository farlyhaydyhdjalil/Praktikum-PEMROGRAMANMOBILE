package com.example.praktikum.frly.kotlin.shrine.network;

/**
 * Class that handles image requests using Volley.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/praktikum/frly/kotlin/shrine/network/ImageRequester;", "", "()V", "imageLoader", "Lcom/android/volley/toolbox/ImageLoader;", "maxByteSize", "", "requestQueue", "Lcom/android/volley/RequestQueue;", "calculateMaxByteSize", "context", "Landroid/content/Context;", "setImageFromUrl", "", "networkImageView", "Lcom/android/volley/toolbox/NetworkImageView;", "url", "", "app_debug"})
public final class ImageRequester {
    @org.jetbrains.annotations.NotNull()
    private static final com.android.volley.RequestQueue requestQueue = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.android.volley.toolbox.ImageLoader imageLoader = null;
    private static final int maxByteSize = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.praktikum.frly.kotlin.shrine.network.ImageRequester INSTANCE = null;
    
    private ImageRequester() {
        super();
    }
    
    /**
     * Sets the image on the given [NetworkImageView] to the image at the given URL
     *
     * @param networkImageView [NetworkImageView] to set image on
     * @param url              URL of the image
     */
    public final void setImageFromUrl(@org.jetbrains.annotations.NotNull()
    com.android.volley.toolbox.NetworkImageView networkImageView, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final int calculateMaxByteSize(android.content.Context context) {
        return 0;
    }
}
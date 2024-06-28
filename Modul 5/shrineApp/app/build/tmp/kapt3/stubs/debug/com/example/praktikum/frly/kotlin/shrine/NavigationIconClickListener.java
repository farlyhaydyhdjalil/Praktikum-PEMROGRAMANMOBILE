package com.example.praktikum.frly.kotlin.shrine;

/**
 * [android.view.View.OnClickListener] used to translate the product grid sheet downward on
 * the Y-axis when the navigation icon in the toolbar is pressed.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/praktikum/frly/kotlin/shrine/NavigationIconClickListener;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "sheet", "Landroid/view/View;", "interpolator", "Landroid/view/animation/Interpolator;", "openIcon", "Landroid/graphics/drawable/Drawable;", "closeIcon", "(Landroid/content/Context;Landroid/view/View;Landroid/view/animation/Interpolator;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "backdropShown", "", "height", "", "onClick", "", "view", "updateIcon", "app_debug"})
public final class NavigationIconClickListener implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View sheet = null;
    @org.jetbrains.annotations.Nullable()
    private final android.view.animation.Interpolator interpolator = null;
    @org.jetbrains.annotations.Nullable()
    private final android.graphics.drawable.Drawable openIcon = null;
    @org.jetbrains.annotations.Nullable()
    private final android.graphics.drawable.Drawable closeIcon = null;
    @org.jetbrains.annotations.NotNull()
    private final android.animation.AnimatorSet animatorSet = null;
    private final int height = 0;
    private boolean backdropShown = false;
    
    @kotlin.jvm.JvmOverloads()
    public NavigationIconClickListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View sheet, @org.jetbrains.annotations.Nullable()
    android.view.animation.Interpolator interpolator, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable openIcon, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable closeIcon) {
        super();
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void updateIcon(android.view.View view) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public NavigationIconClickListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View sheet) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public NavigationIconClickListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View sheet, @org.jetbrains.annotations.Nullable()
    android.view.animation.Interpolator interpolator) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public NavigationIconClickListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View sheet, @org.jetbrains.annotations.Nullable()
    android.view.animation.Interpolator interpolator, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable openIcon) {
        super();
    }
}
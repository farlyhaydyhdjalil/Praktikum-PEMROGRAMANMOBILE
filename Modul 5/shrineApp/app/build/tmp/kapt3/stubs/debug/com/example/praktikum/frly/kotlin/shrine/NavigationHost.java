package com.example.praktikum.frly.kotlin.shrine;

/**
 * A host (typically an `Activity`} that can display fragments and knows how to respond to
 * navigation events.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/praktikum/frly/kotlin/shrine/NavigationHost;", "", "navigateTo", "", "fragment", "Landroidx/fragment/app/Fragment;", "addToBackstack", "", "app_debug"})
public abstract interface NavigationHost {
    
    /**
     * Trigger a navigation to the specified fragment, optionally adding a transaction to the back
     * stack to make this navigation reversible.
     */
    public abstract void navigateTo(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, boolean addToBackstack);
}
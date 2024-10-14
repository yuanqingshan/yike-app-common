package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final EspressoLibraryAccessors laccForEspressoLibraryAccessors = new EspressoLibraryAccessors(owner);
    private final GlanceLibraryAccessors laccForGlanceLibraryAccessors = new GlanceLibraryAccessors(owner);
    private final GradleLibraryAccessors laccForGradleLibraryAccessors = new GradleLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final KcomponentLibraryAccessors laccForKcomponentLibraryAccessors = new KcomponentLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KspLibraryAccessors laccForKspLibraryAccessors = new KspLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final LottieLibraryAccessors laccForLottieLibraryAccessors = new LottieLibraryAccessors(owner);
    private final RetrofitLibraryAccessors laccForRetrofitLibraryAccessors = new RetrofitLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final XiaojinziLibraryAccessors laccForXiaojinziLibraryAccessors = new XiaojinziLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
     * with versionRef 'junit'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit");
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
     * with versionRef 'material'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("material");
    }

        /**
         * Creates a dependency provider for okhttp3 (com.squareup.okhttp3:okhttp)
     * with version '4.12.0'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp3() {
            return create("okhttp3");
    }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() {
        return laccForAndroidLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at espresso
     */
    public EspressoLibraryAccessors getEspresso() {
        return laccForEspressoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at glance
     */
    public GlanceLibraryAccessors getGlance() {
        return laccForGlanceLibraryAccessors;
    }

    /**
     * Returns the group of libraries at gradle
     */
    public GradleLibraryAccessors getGradle() {
        return laccForGradleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at hilt
     */
    public HiltLibraryAccessors getHilt() {
        return laccForHiltLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kcomponent
     */
    public KcomponentLibraryAccessors getKcomponent() {
        return laccForKcomponentLibraryAccessors;
    }

    /**
     * Returns the group of libraries at koin
     */
    public KoinLibraryAccessors getKoin() {
        return laccForKoinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ksp
     */
    public KspLibraryAccessors getKsp() {
        return laccForKspLibraryAccessors;
    }

    /**
     * Returns the group of libraries at lifecycle
     */
    public LifecycleLibraryAccessors getLifecycle() {
        return laccForLifecycleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at lottie
     */
    public LottieLibraryAccessors getLottie() {
        return laccForLottieLibraryAccessors;
    }

    /**
     * Returns the group of libraries at retrofit
     */
    public RetrofitLibraryAccessors getRetrofit() {
        return laccForRetrofitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Returns the group of libraries at xiaojinzi
     */
    public XiaojinziLibraryAccessors getXiaojinzi() {
        return laccForXiaojinziLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (com.android.tools.build:gradle)
         * with versionRef 'agp'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("android.gradlePlugin");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);
        private final AndroidxWorkLibraryAccessors laccForAndroidxWorkLibraryAccessors = new AndroidxWorkLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotation (androidx.annotation:annotation)
         * with version '1.8.2'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotation() {
                return create("androidx.annotation");
        }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * with version '1.7.0'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.appcompat");
        }

            /**
             * Creates a dependency provider for core (androidx.core:core-ktx)
         * with version '1.13.1'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.core");
        }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() {
            return laccForAndroidxTestLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.work
         */
        public AndroidxWorkLibraryAccessors getWork() {
            return laccForAndroidxWorkLibraryAccessors;
        }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestExtLibraryAccessors laccForAndroidxTestExtLibraryAccessors = new AndroidxTestExtLibraryAccessors(owner);

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test.ext
         */
        public AndroidxTestExtLibraryAccessors getExt() {
            return laccForAndroidxTestExtLibraryAccessors;
        }

    }

    public static class AndroidxTestExtLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
         * with versionRef 'androidx.test.ext.junit'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() {
                return create("androidx.test.ext.junit");
        }

    }

    public static class AndroidxWorkLibraryAccessors extends SubDependencyFactory {
        private final AndroidxWorkManagerLibraryAccessors laccForAndroidxWorkManagerLibraryAccessors = new AndroidxWorkManagerLibraryAccessors(owner);

        public AndroidxWorkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.work.manager
         */
        public AndroidxWorkManagerLibraryAccessors getManager() {
            return laccForAndroidxWorkManagerLibraryAccessors;
        }

    }

    public static class AndroidxWorkManagerLibraryAccessors extends SubDependencyFactory {

        public AndroidxWorkManagerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.work:work-runtime-ktx)
         * with versionRef 'work.manager'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.work.manager.ktx");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeFoundationLibraryAccessors laccForComposeFoundationLibraryAccessors = new ComposeFoundationLibraryAccessors(owner);
        private final ComposeMaterialLibraryAccessors laccForComposeMaterialLibraryAccessors = new ComposeMaterialLibraryAccessors(owner);
        private final ComposeRuntimeLibraryAccessors laccForComposeRuntimeLibraryAccessors = new ComposeRuntimeLibraryAccessors(owner);
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
         * with version '1.2.1'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("compose.material3");
        }

        /**
         * Returns the group of libraries at compose.foundation
         */
        public ComposeFoundationLibraryAccessors getFoundation() {
            return laccForComposeFoundationLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.material
         */
        public ComposeMaterialLibraryAccessors getMaterial() {
            return laccForComposeMaterialLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.runtime
         */
        public ComposeRuntimeLibraryAccessors getRuntime() {
            return laccForComposeRuntimeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeFoundationLibraryAccessors extends SubDependencyFactory {
        private final ComposeFoundationLayoutLibraryAccessors laccForComposeFoundationLayoutLibraryAccessors = new ComposeFoundationLayoutLibraryAccessors(owner);

        public ComposeFoundationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.compose.foundation:foundation-android)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("compose.foundation.android");
        }

        /**
         * Returns the group of libraries at compose.foundation.layout
         */
        public ComposeFoundationLayoutLibraryAccessors getLayout() {
            return laccForComposeFoundationLayoutLibraryAccessors;
        }

    }

    public static class ComposeFoundationLayoutLibraryAccessors extends SubDependencyFactory {

        public ComposeFoundationLayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.compose.foundation:foundation-layout-android)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("compose.foundation.layout.android");
        }

    }

    public static class ComposeMaterialLibraryAccessors extends SubDependencyFactory {

        public ComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.compose.material:material-android)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("compose.material.android");
        }

    }

    public static class ComposeRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.compose.runtime:runtime)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.runtime");
        }

            /**
             * Creates a dependency provider for android (androidx.compose.runtime:runtime-android)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("compose.runtime.android");
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory {

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.compose.ui:ui-android)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("compose.ui.android");
        }

    }

    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
         * with versionRef 'espresso.core'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("espresso.core");
        }

    }

    public static class GlanceLibraryAccessors extends SubDependencyFactory {

        public GlanceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appwidget (androidx.glance:glance-appwidget)
         * with versionRef 'glance'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppwidget() {
                return create("glance.appwidget");
        }

            /**
             * Creates a dependency provider for material3 (androidx.glance:glance-material3)
         * with versionRef 'glance'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("glance.material3");
        }

    }

    public static class GradleLibraryAccessors extends SubDependencyFactory {
        private final GradleKotlinLibraryAccessors laccForGradleKotlinLibraryAccessors = new GradleKotlinLibraryAccessors(owner);

        public GradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at gradle.kotlin
         */
        public GradleKotlinLibraryAccessors getKotlin() {
            return laccForGradleKotlinLibraryAccessors;
        }

    }

    public static class GradleKotlinLibraryAccessors extends SubDependencyFactory {
        private final GradleKotlinDslLibraryAccessors laccForGradleKotlinDslLibraryAccessors = new GradleKotlinDslLibraryAccessors(owner);

        public GradleKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at gradle.kotlin.dsl
         */
        public GradleKotlinDslLibraryAccessors getDsl() {
            return laccForGradleKotlinDslLibraryAccessors;
        }

    }

    public static class GradleKotlinDslLibraryAccessors extends SubDependencyFactory {

        public GradleKotlinDslLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.gradle.kotlin:gradle-kotlin-dsl-plugins)
         * with version '4.3.0'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() {
                return create("gradle.kotlin.dsl.plugin");
        }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android)
         * with versionRef 'hilt'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("hilt");
        }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-compiler)
         * with versionRef 'hilt'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("hilt.compiler");
        }

    }

    public static class KcomponentLibraryAccessors extends SubDependencyFactory {

        public KcomponentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (com.github.xiaojinzi123.KComponent:kcomponent-compiler)
         * with versionRef 'kcomponent'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("kcomponent.compiler");
        }

            /**
             * Creates a dependency provider for core (com.github.xiaojinzi123.KComponent:kcomponent)
         * with versionRef 'kcomponent'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kcomponent.core");
        }

            /**
             * Creates a dependency provider for gradleplugin (com.github.xiaojinzi123.KComponent:kcomponent-plugin)
         * with versionRef 'kcomponent'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradleplugin() {
                return create("kcomponent.gradleplugin");
        }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.insert-koin:koin-android)
         * with versionRef 'koin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("koin.android");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinGradlePluginLibraryAccessors laccForKotlinGradlePluginLibraryAccessors = new KotlinGradlePluginLibraryAccessors(owner);
        private final KotlinParcelizeLibraryAccessors laccForKotlinParcelizeLibraryAccessors = new KotlinParcelizeLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlin.gradlePlugin
         */
        public KotlinGradlePluginLibraryAccessors getGradlePlugin() {
            return laccForKotlinGradlePluginLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlin.parcelize
         */
        public KotlinParcelizeLibraryAccessors getParcelize() {
            return laccForKotlinParcelizeLibraryAccessors;
        }

    }

    public static class KotlinGradlePluginLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinGradlePluginLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
         * with versionRef 'kotlin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("kotlin.gradlePlugin");
        }

            /**
             * Creates a dependency provider for api (org.jetbrains.kotlin:kotlin-gradle-plugin-api)
         * with versionRef 'kotlin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("kotlin.gradlePlugin.api");
        }

    }

    public static class KotlinParcelizeLibraryAccessors extends SubDependencyFactory {

        public KotlinParcelizeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (org.jetbrains.kotlin:kotlin-parcelize-runtime)
         * with versionRef 'kotlin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("kotlin.parcelize.runtime");
        }

    }

    public static class KspLibraryAccessors extends SubDependencyFactory {

        public KspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (com.google.devtools.ksp:symbol-processing-gradle-plugin)
         * with versionRef 'ksp'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("ksp.gradlePlugin");
        }

    }

    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleViewmodelLibraryAccessors laccForLifecycleViewmodelLibraryAccessors = new LifecycleViewmodelLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at lifecycle.viewmodel
         */
        public LifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class LifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public LifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-viewmodel-compose)
         * with versionRef 'lifecycle'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("lifecycle.viewmodel.compose");
        }

    }

    public static class LottieLibraryAccessors extends SubDependencyFactory {

        public LottieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (com.airbnb.android:lottie-compose)
         * with versionRef 'lottie'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("lottie.compose");
        }

    }

    public static class RetrofitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final RetrofitConverterLibraryAccessors laccForRetrofitConverterLibraryAccessors = new RetrofitConverterLibraryAccessors(owner);

        public RetrofitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
         * with versionRef 'retrofit'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("retrofit");
        }

        /**
         * Returns the group of libraries at retrofit.converter
         */
        public RetrofitConverterLibraryAccessors getConverter() {
            return laccForRetrofitConverterLibraryAccessors;
        }

    }

    public static class RetrofitConverterLibraryAccessors extends SubDependencyFactory {

        public RetrofitConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.squareup.retrofit2:converter-gson)
         * with versionRef 'retrofit'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() {
                return create("retrofit.converter.gson");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
         * with versionRef 'room'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("room.compiler");
        }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
         * with versionRef 'room'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("room.ktx");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
         * with versionRef 'room'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("room.runtime");
        }

    }

    public static class XiaojinziLibraryAccessors extends SubDependencyFactory {
        private final XiaojinziAndroidLibraryAccessors laccForXiaojinziAndroidLibraryAccessors = new XiaojinziAndroidLibraryAccessors(owner);

        public XiaojinziLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at xiaojinzi.android
         */
        public XiaojinziAndroidLibraryAccessors getAndroid() {
            return laccForXiaojinziAndroidLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidLibraryAccessors extends SubDependencyFactory {
        private final XiaojinziAndroidModuleLibraryAccessors laccForXiaojinziAndroidModuleLibraryAccessors = new XiaojinziAndroidModuleLibraryAccessors(owner);
        private final XiaojinziAndroidReactiveLibraryAccessors laccForXiaojinziAndroidReactiveLibraryAccessors = new XiaojinziAndroidReactiveLibraryAccessors(owner);
        private final XiaojinziAndroidSupportLibraryAccessors laccForXiaojinziAndroidSupportLibraryAccessors = new XiaojinziAndroidSupportLibraryAccessors(owner);

        public XiaojinziAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at xiaojinzi.android.module
         */
        public XiaojinziAndroidModuleLibraryAccessors getModule() {
            return laccForXiaojinziAndroidModuleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at xiaojinzi.android.reactive
         */
        public XiaojinziAndroidReactiveLibraryAccessors getReactive() {
            return laccForXiaojinziAndroidReactiveLibraryAccessors;
        }

        /**
         * Returns the group of libraries at xiaojinzi.android.support
         */
        public XiaojinziAndroidSupportLibraryAccessors getSupport() {
            return laccForXiaojinziAndroidSupportLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidModuleLibraryAccessors extends SubDependencyFactory {
        private final XiaojinziAndroidModuleAliLibraryAccessors laccForXiaojinziAndroidModuleAliLibraryAccessors = new XiaojinziAndroidModuleAliLibraryAccessors(owner);
        private final XiaojinziAndroidModuleWxLibraryAccessors laccForXiaojinziAndroidModuleWxLibraryAccessors = new XiaojinziAndroidModuleWxLibraryAccessors(owner);

        public XiaojinziAndroidModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ffmpeg (com.github.xiaojinzi123.AndroidModule:module-ffmpeg)
         * with versionRef 'xiaojinzi.android.module'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFfmpeg() {
                return create("xiaojinzi.android.module.ffmpeg");
        }

            /**
             * Creates a dependency provider for storage (com.github.xiaojinzi123.AndroidModule:module-storage)
         * with versionRef 'xiaojinzi.android.module'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStorage() {
                return create("xiaojinzi.android.module.storage");
        }

        /**
         * Returns the group of libraries at xiaojinzi.android.module.ali
         */
        public XiaojinziAndroidModuleAliLibraryAccessors getAli() {
            return laccForXiaojinziAndroidModuleAliLibraryAccessors;
        }

        /**
         * Returns the group of libraries at xiaojinzi.android.module.wx
         */
        public XiaojinziAndroidModuleWxLibraryAccessors getWx() {
            return laccForXiaojinziAndroidModuleWxLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidModuleAliLibraryAccessors extends SubDependencyFactory {

        public XiaojinziAndroidModuleAliLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for oss (com.github.xiaojinzi123.AndroidModule:module-ali-oss)
         * with versionRef 'xiaojinzi.android.module'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOss() {
                return create("xiaojinzi.android.module.ali.oss");
        }

            /**
             * Creates a dependency provider for pay (com.github.xiaojinzi123.AndroidModule:module-ali-pay)
         * with versionRef 'xiaojinzi.android.module'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPay() {
                return create("xiaojinzi.android.module.ali.pay");
        }

    }

    public static class XiaojinziAndroidModuleWxLibraryAccessors extends SubDependencyFactory {

        public XiaojinziAndroidModuleWxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sdk (com.github.xiaojinzi123.AndroidModule:module-wx-sdk)
         * with versionRef 'xiaojinzi.android.module'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSdk() {
                return create("xiaojinzi.android.module.wx.sdk");
        }

    }

    public static class XiaojinziAndroidReactiveLibraryAccessors extends SubDependencyFactory {
        private final XiaojinziAndroidReactiveTemplateLibraryAccessors laccForXiaojinziAndroidReactiveTemplateLibraryAccessors = new XiaojinziAndroidReactiveTemplateLibraryAccessors(owner);

        public XiaojinziAndroidReactiveLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.github.xiaojinzi123.AndroidReactive:reactive-core)
         * with versionRef 'xiaojinzi.android.reactive'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("xiaojinzi.android.reactive.core");
        }

        /**
         * Returns the group of libraries at xiaojinzi.android.reactive.template
         */
        public XiaojinziAndroidReactiveTemplateLibraryAccessors getTemplate() {
            return laccForXiaojinziAndroidReactiveTemplateLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidReactiveTemplateLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public XiaojinziAndroidReactiveTemplateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for template (com.github.xiaojinzi123.AndroidReactive:reactive-template)
         * with versionRef 'xiaojinzi.android.reactive'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("xiaojinzi.android.reactive.template");
        }

            /**
             * Creates a dependency provider for compose (com.github.xiaojinzi123.AndroidReactive:reactive-template-compose)
         * with versionRef 'xiaojinzi.android.reactive'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("xiaojinzi.android.reactive.template.compose");
        }

    }

    public static class XiaojinziAndroidSupportLibraryAccessors extends SubDependencyFactory {
        private final XiaojinziAndroidSupportKtxLibraryAccessors laccForXiaojinziAndroidSupportKtxLibraryAccessors = new XiaojinziAndroidSupportKtxLibraryAccessors(owner);

        public XiaojinziAndroidSupportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activitystack (com.github.xiaojinzi123.AndroidSupport:lib-activity-stack)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivitystack() {
                return create("xiaojinzi.android.support.activitystack");
        }

            /**
             * Creates a dependency provider for annotation (com.github.xiaojinzi123.AndroidSupport:lib-annotation)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotation() {
                return create("xiaojinzi.android.support.annotation");
        }

            /**
             * Creates a dependency provider for bean (com.github.xiaojinzi123.AndroidSupport:lib-bean)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBean() {
                return create("xiaojinzi.android.support.bean");
        }

            /**
             * Creates a dependency provider for compose (com.github.xiaojinzi123.AndroidSupport:lib-compose)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("xiaojinzi.android.support.compose");
        }

            /**
             * Creates a dependency provider for init (com.github.xiaojinzi123.AndroidSupport:lib-init)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInit() {
                return create("xiaojinzi.android.support.init");
        }

        /**
         * Returns the group of libraries at xiaojinzi.android.support.ktx
         */
        public XiaojinziAndroidSupportKtxLibraryAccessors getKtx() {
            return laccForXiaojinziAndroidSupportKtxLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidSupportKtxLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public XiaojinziAndroidSupportKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.github.xiaojinzi123.AndroidSupport:lib-ktx)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("xiaojinzi.android.support.ktx");
        }

            /**
             * Creates a dependency provider for retrofit (com.github.xiaojinzi123.AndroidSupport:lib-ktx-retrofit)
         * with versionRef 'xiaojinzi.android.support'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRetrofit() {
                return create("xiaojinzi.android.support.ktx.retrofit");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final EspressoVersionAccessors vaccForEspressoVersionAccessors = new EspressoVersionAccessors(providers, config);
        private final WorkVersionAccessors vaccForWorkVersionAccessors = new WorkVersionAccessors(providers, config);
        private final XiaojinziVersionAccessors vaccForXiaojinziVersionAccessors = new XiaojinziVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (8.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: compileSdk (34)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompileSdk() { return getVersion("compileSdk"); }

            /**
             * Returns the version associated to this alias: compose (1.6.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: glance (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGlance() { return getVersion("glance"); }

            /**
             * Returns the version associated to this alias: hilt (2.51.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: kcomponent (v1.0.8-rc7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKcomponent() { return getVersion("kcomponent"); }

            /**
             * Returns the version associated to this alias: koin (3.5.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoin() { return getVersion("koin"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.23)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ksp (1.9.0-1.0.13)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKsp() { return getVersion("ksp"); }

            /**
             * Returns the version associated to this alias: lifecycle (2.8.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("lifecycle"); }

            /**
             * Returns the version associated to this alias: lottie (6.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLottie() { return getVersion("lottie"); }

            /**
             * Returns the version associated to this alias: material (1.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: minSdk (21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMinSdk() { return getVersion("minSdk"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: room (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: targetSdk (34)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTargetSdk() { return getVersion("targetSdk"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.espresso
         */
        public EspressoVersionAccessors getEspresso() {
            return vaccForEspressoVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.work
         */
        public WorkVersionAccessors getWork() {
            return vaccForWorkVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.xiaojinzi
         */
        public XiaojinziVersionAccessors getXiaojinzi() {
            return vaccForXiaojinziVersionAccessors;
        }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx.test
         */
        public AndroidxTestVersionAccessors getTest() {
            return vaccForAndroidxTestVersionAccessors;
        }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  {

        private final AndroidxTestExtVersionAccessors vaccForAndroidxTestExtVersionAccessors = new AndroidxTestExtVersionAccessors(providers, config);
        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx.test.ext
         */
        public AndroidxTestExtVersionAccessors getExt() {
            return vaccForAndroidxTestExtVersionAccessors;
        }

    }

    public static class AndroidxTestExtVersionAccessors extends VersionFactory  {

        public AndroidxTestExtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.ext.junit (1.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("androidx.test.ext.junit"); }

    }

    public static class EspressoVersionAccessors extends VersionFactory  {

        public EspressoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: espresso.core (3.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("espresso.core"); }

    }

    public static class WorkVersionAccessors extends VersionFactory  {

        public WorkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: work.manager (2.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getManager() { return getVersion("work.manager"); }

    }

    public static class XiaojinziVersionAccessors extends VersionFactory  {

        private final XiaojinziAndroidVersionAccessors vaccForXiaojinziAndroidVersionAccessors = new XiaojinziAndroidVersionAccessors(providers, config);
        public XiaojinziVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.xiaojinzi.android
         */
        public XiaojinziAndroidVersionAccessors getAndroid() {
            return vaccForXiaojinziAndroidVersionAccessors;
        }

    }

    public static class XiaojinziAndroidVersionAccessors extends VersionFactory  {

        public XiaojinziAndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: xiaojinzi.android.module (1a1a77bb69)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getModule() { return getVersion("xiaojinzi.android.module"); }

            /**
             * Returns the version associated to this alias: xiaojinzi.android.reactive (v1.0.0-rc1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getReactive() { return getVersion("xiaojinzi.android.reactive"); }

            /**
             * Returns the version associated to this alias: xiaojinzi.android.support (v1.0-beta223)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSupport() { return getVersion("xiaojinzi.android.support"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors paccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final HiltPluginAccessors paccForHiltPluginAccessors = new HiltPluginAccessors(providers, config);
        private final KotlinPluginAccessors paccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.android
         */
        public AndroidPluginAccessors getAndroid() {
            return paccForAndroidPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.hilt
         */
        public HiltPluginAccessors getHilt() {
            return paccForHiltPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() {
            return paccForKotlinPluginAccessors;
        }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for android.application to the plugin id 'com.android.application'
             * with versionRef 'agp'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

            /**
             * Creates a plugin provider for android.library to the plugin id 'com.android.library'
             * with versionRef 'agp'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

    }

    public static class HiltPluginAccessors extends PluginFactory {

        public HiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for hilt.android to the plugin id 'com.google.dagger.hilt.android'
             * with versionRef 'hilt'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("hilt.android"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("kotlin.android"); }

    }

}

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
 * A catalog of dependencies accessible via the {@code libs} extension.
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
     * Dependency provider for <b>junit</b> with <b>junit:junit</b> coordinates and
     * with version reference <b>junit</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getJunit() {
        return create("junit");
    }

    /**
     * Dependency provider for <b>material</b> with <b>com.google.android.material:material</b> coordinates and
     * with version reference <b>material</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMaterial() {
        return create("material");
    }

    /**
     * Dependency provider for <b>okhttp3</b> with <b>com.squareup.okhttp3:okhttp</b> coordinates and
     * with version <b>4.12.0</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getOkhttp3() {
        return create("okhttp3");
    }

    /**
     * Group of libraries at <b>android</b>
     */
    public AndroidLibraryAccessors getAndroid() {
        return laccForAndroidLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidx</b>
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Group of libraries at <b>compose</b>
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>espresso</b>
     */
    public EspressoLibraryAccessors getEspresso() {
        return laccForEspressoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>glance</b>
     */
    public GlanceLibraryAccessors getGlance() {
        return laccForGlanceLibraryAccessors;
    }

    /**
     * Group of libraries at <b>gradle</b>
     */
    public GradleLibraryAccessors getGradle() {
        return laccForGradleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hilt</b>
     */
    public HiltLibraryAccessors getHilt() {
        return laccForHiltLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kcomponent</b>
     */
    public KcomponentLibraryAccessors getKcomponent() {
        return laccForKcomponentLibraryAccessors;
    }

    /**
     * Group of libraries at <b>koin</b>
     */
    public KoinLibraryAccessors getKoin() {
        return laccForKoinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlin</b>
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ksp</b>
     */
    public KspLibraryAccessors getKsp() {
        return laccForKspLibraryAccessors;
    }

    /**
     * Group of libraries at <b>lifecycle</b>
     */
    public LifecycleLibraryAccessors getLifecycle() {
        return laccForLifecycleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>lottie</b>
     */
    public LottieLibraryAccessors getLottie() {
        return laccForLottieLibraryAccessors;
    }

    /**
     * Group of libraries at <b>retrofit</b>
     */
    public RetrofitLibraryAccessors getRetrofit() {
        return laccForRetrofitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>room</b>
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Group of libraries at <b>xiaojinzi</b>
     */
    public XiaojinziLibraryAccessors getXiaojinzi() {
        return laccForXiaojinziLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gradlePlugin</b> with <b>com.android.tools.build:gradle</b> coordinates and
         * with version reference <b>agp</b>
         * <p>
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
         * Dependency provider for <b>annotation</b> with <b>androidx.annotation:annotation</b> coordinates and
         * with version <b>1.8.2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotation() {
            return create("androidx.annotation");
        }

        /**
         * Dependency provider for <b>appcompat</b> with <b>androidx.appcompat:appcompat</b> coordinates and
         * with version <b>1.7.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() {
            return create("androidx.appcompat");
        }

        /**
         * Dependency provider for <b>core</b> with <b>androidx.core:core-ktx</b> coordinates and
         * with version <b>1.13.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("androidx.core");
        }

        /**
         * Group of libraries at <b>androidx.test</b>
         */
        public AndroidxTestLibraryAccessors getTest() {
            return laccForAndroidxTestLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.work</b>
         */
        public AndroidxWorkLibraryAccessors getWork() {
            return laccForAndroidxWorkLibraryAccessors;
        }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestExtLibraryAccessors laccForAndroidxTestExtLibraryAccessors = new AndroidxTestExtLibraryAccessors(owner);

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>androidx.test.ext</b>
         */
        public AndroidxTestExtLibraryAccessors getExt() {
            return laccForAndroidxTestExtLibraryAccessors;
        }

    }

    public static class AndroidxTestExtLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit</b> with <b>androidx.test.ext:junit</b> coordinates and
         * with version reference <b>androidx.test.ext.junit</b>
         * <p>
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
         * Group of libraries at <b>androidx.work.manager</b>
         */
        public AndroidxWorkManagerLibraryAccessors getManager() {
            return laccForAndroidxWorkManagerLibraryAccessors;
        }

    }

    public static class AndroidxWorkManagerLibraryAccessors extends SubDependencyFactory {

        public AndroidxWorkManagerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.work:work-runtime-ktx</b> coordinates and
         * with version reference <b>work.manager</b>
         * <p>
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
         * Dependency provider for <b>material3</b> with <b>androidx.compose.material3:material3</b> coordinates and
         * with version <b>1.3.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial3() {
            return create("compose.material3");
        }

        /**
         * Group of libraries at <b>compose.foundation</b>
         */
        public ComposeFoundationLibraryAccessors getFoundation() {
            return laccForComposeFoundationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>compose.material</b>
         */
        public ComposeMaterialLibraryAccessors getMaterial() {
            return laccForComposeMaterialLibraryAccessors;
        }

        /**
         * Group of libraries at <b>compose.runtime</b>
         */
        public ComposeRuntimeLibraryAccessors getRuntime() {
            return laccForComposeRuntimeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>compose.ui</b>
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeFoundationLibraryAccessors extends SubDependencyFactory {
        private final ComposeFoundationLayoutLibraryAccessors laccForComposeFoundationLayoutLibraryAccessors = new ComposeFoundationLayoutLibraryAccessors(owner);

        public ComposeFoundationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>androidx.compose.foundation:foundation-android</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("compose.foundation.android");
        }

        /**
         * Group of libraries at <b>compose.foundation.layout</b>
         */
        public ComposeFoundationLayoutLibraryAccessors getLayout() {
            return laccForComposeFoundationLayoutLibraryAccessors;
        }

    }

    public static class ComposeFoundationLayoutLibraryAccessors extends SubDependencyFactory {

        public ComposeFoundationLayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>androidx.compose.foundation:foundation-layout-android</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("compose.foundation.layout.android");
        }

    }

    public static class ComposeMaterialLibraryAccessors extends SubDependencyFactory {

        public ComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>androidx.compose.material:material-android</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("compose.material.android");
        }

    }

    public static class ComposeRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>runtime</b> with <b>androidx.compose.runtime:runtime</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("compose.runtime");
        }

        /**
         * Dependency provider for <b>android</b> with <b>androidx.compose.runtime:runtime-android</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("compose.runtime.android");
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory {

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>androidx.compose.ui:ui-android</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("compose.ui.android");
        }

    }

    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>androidx.test.espresso:espresso-core</b> coordinates and
         * with version reference <b>espresso.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("espresso.core");
        }

    }

    public static class GlanceLibraryAccessors extends SubDependencyFactory {

        public GlanceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>appwidget</b> with <b>androidx.glance:glance-appwidget</b> coordinates and
         * with version reference <b>glance</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppwidget() {
            return create("glance.appwidget");
        }

        /**
         * Dependency provider for <b>material3</b> with <b>androidx.glance:glance-material3</b> coordinates and
         * with version reference <b>glance</b>
         * <p>
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
         * Group of libraries at <b>gradle.kotlin</b>
         */
        public GradleKotlinLibraryAccessors getKotlin() {
            return laccForGradleKotlinLibraryAccessors;
        }

    }

    public static class GradleKotlinLibraryAccessors extends SubDependencyFactory {
        private final GradleKotlinDslLibraryAccessors laccForGradleKotlinDslLibraryAccessors = new GradleKotlinDslLibraryAccessors(owner);

        public GradleKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>gradle.kotlin.dsl</b>
         */
        public GradleKotlinDslLibraryAccessors getDsl() {
            return laccForGradleKotlinDslLibraryAccessors;
        }

    }

    public static class GradleKotlinDslLibraryAccessors extends SubDependencyFactory {

        public GradleKotlinDslLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>plugin</b> with <b>org.gradle.kotlin:gradle-kotlin-dsl-plugins</b> coordinates and
         * with version <b>4.4.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlugin() {
            return create("gradle.kotlin.dsl.plugin");
        }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hilt</b> with <b>com.google.dagger:hilt-android</b> coordinates and
         * with version reference <b>hilt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("hilt");
        }

        /**
         * Dependency provider for <b>compiler</b> with <b>com.google.dagger:hilt-compiler</b> coordinates and
         * with version reference <b>hilt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompiler() {
            return create("hilt.compiler");
        }

    }

    public static class KcomponentLibraryAccessors extends SubDependencyFactory {

        public KcomponentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compiler</b> with <b>com.github.xiaojinzi123.KComponent:kcomponent-compiler</b> coordinates and
         * with version reference <b>kcomponent</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompiler() {
            return create("kcomponent.compiler");
        }

        /**
         * Dependency provider for <b>core</b> with <b>com.github.xiaojinzi123.KComponent:kcomponent</b> coordinates and
         * with version reference <b>kcomponent</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("kcomponent.core");
        }

        /**
         * Dependency provider for <b>gradleplugin</b> with <b>com.github.xiaojinzi123.KComponent:kcomponent-plugin</b> coordinates and
         * with version reference <b>kcomponent</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGradleplugin() {
            return create("kcomponent.gradleplugin");
        }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>io.insert-koin:koin-android</b> coordinates and
         * with version reference <b>koin</b>
         * <p>
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
         * Group of libraries at <b>kotlin.gradlePlugin</b>
         */
        public KotlinGradlePluginLibraryAccessors getGradlePlugin() {
            return laccForKotlinGradlePluginLibraryAccessors;
        }

        /**
         * Group of libraries at <b>kotlin.parcelize</b>
         */
        public KotlinParcelizeLibraryAccessors getParcelize() {
            return laccForKotlinParcelizeLibraryAccessors;
        }

    }

    public static class KotlinGradlePluginLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinGradlePluginLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gradlePlugin</b> with <b>org.jetbrains.kotlin:kotlin-gradle-plugin</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("kotlin.gradlePlugin");
        }

        /**
         * Dependency provider for <b>api</b> with <b>org.jetbrains.kotlin:kotlin-gradle-plugin-api</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("kotlin.gradlePlugin.api");
        }

    }

    public static class KotlinParcelizeLibraryAccessors extends SubDependencyFactory {

        public KotlinParcelizeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>runtime</b> with <b>org.jetbrains.kotlin:kotlin-parcelize-runtime</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRuntime() {
            return create("kotlin.parcelize.runtime");
        }

    }

    public static class KspLibraryAccessors extends SubDependencyFactory {

        public KspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gradlePlugin</b> with <b>com.google.devtools.ksp:symbol-processing-gradle-plugin</b> coordinates and
         * with version reference <b>ksp</b>
         * <p>
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
         * Group of libraries at <b>lifecycle.viewmodel</b>
         */
        public LifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class LifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public LifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.lifecycle:lifecycle-viewmodel-compose</b> coordinates and
         * with version reference <b>lifecycle</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("lifecycle.viewmodel.compose");
        }

    }

    public static class LottieLibraryAccessors extends SubDependencyFactory {

        public LottieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>com.airbnb.android:lottie-compose</b> coordinates and
         * with version reference <b>lottie</b>
         * <p>
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
         * Dependency provider for <b>retrofit</b> with <b>com.squareup.retrofit2:retrofit</b> coordinates and
         * with version reference <b>retrofit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("retrofit");
        }

        /**
         * Group of libraries at <b>retrofit.converter</b>
         */
        public RetrofitConverterLibraryAccessors getConverter() {
            return laccForRetrofitConverterLibraryAccessors;
        }

    }

    public static class RetrofitConverterLibraryAccessors extends SubDependencyFactory {

        public RetrofitConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gson</b> with <b>com.squareup.retrofit2:converter-gson</b> coordinates and
         * with version reference <b>retrofit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("retrofit.converter.gson");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compiler</b> with <b>androidx.room:room-compiler</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompiler() {
            return create("room.compiler");
        }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.room:room-ktx</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtx() {
            return create("room.ktx");
        }

        /**
         * Dependency provider for <b>runtime</b> with <b>androidx.room:room-runtime</b> coordinates and
         * with version reference <b>room</b>
         * <p>
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
         * Group of libraries at <b>xiaojinzi.android</b>
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
         * Group of libraries at <b>xiaojinzi.android.module</b>
         */
        public XiaojinziAndroidModuleLibraryAccessors getModule() {
            return laccForXiaojinziAndroidModuleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>xiaojinzi.android.reactive</b>
         */
        public XiaojinziAndroidReactiveLibraryAccessors getReactive() {
            return laccForXiaojinziAndroidReactiveLibraryAccessors;
        }

        /**
         * Group of libraries at <b>xiaojinzi.android.support</b>
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
         * Dependency provider for <b>ffmpeg</b> with <b>com.github.xiaojinzi123.AndroidModule:module-ffmpeg</b> coordinates and
         * with version reference <b>xiaojinzi.android.module</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFfmpeg() {
            return create("xiaojinzi.android.module.ffmpeg");
        }

        /**
         * Dependency provider for <b>storage</b> with <b>com.github.xiaojinzi123.AndroidModule:module-storage</b> coordinates and
         * with version reference <b>xiaojinzi.android.module</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStorage() {
            return create("xiaojinzi.android.module.storage");
        }

        /**
         * Group of libraries at <b>xiaojinzi.android.module.ali</b>
         */
        public XiaojinziAndroidModuleAliLibraryAccessors getAli() {
            return laccForXiaojinziAndroidModuleAliLibraryAccessors;
        }

        /**
         * Group of libraries at <b>xiaojinzi.android.module.wx</b>
         */
        public XiaojinziAndroidModuleWxLibraryAccessors getWx() {
            return laccForXiaojinziAndroidModuleWxLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidModuleAliLibraryAccessors extends SubDependencyFactory {

        public XiaojinziAndroidModuleAliLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>oss</b> with <b>com.github.xiaojinzi123.AndroidModule:module-ali-oss</b> coordinates and
         * with version reference <b>xiaojinzi.android.module</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOss() {
            return create("xiaojinzi.android.module.ali.oss");
        }

        /**
         * Dependency provider for <b>pay</b> with <b>com.github.xiaojinzi123.AndroidModule:module-ali-pay</b> coordinates and
         * with version reference <b>xiaojinzi.android.module</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPay() {
            return create("xiaojinzi.android.module.ali.pay");
        }

    }

    public static class XiaojinziAndroidModuleWxLibraryAccessors extends SubDependencyFactory {

        public XiaojinziAndroidModuleWxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>com.github.xiaojinzi123.AndroidModule:module-wx-sdk</b> coordinates and
         * with version reference <b>xiaojinzi.android.module</b>
         * <p>
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
         * Dependency provider for <b>core</b> with <b>com.github.xiaojinzi123.AndroidReactive:reactive-core</b> coordinates and
         * with version reference <b>xiaojinzi.android.reactive</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("xiaojinzi.android.reactive.core");
        }

        /**
         * Group of libraries at <b>xiaojinzi.android.reactive.template</b>
         */
        public XiaojinziAndroidReactiveTemplateLibraryAccessors getTemplate() {
            return laccForXiaojinziAndroidReactiveTemplateLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidReactiveTemplateLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public XiaojinziAndroidReactiveTemplateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>template</b> with <b>com.github.xiaojinzi123.AndroidReactive:reactive-template</b> coordinates and
         * with version reference <b>xiaojinzi.android.reactive</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("xiaojinzi.android.reactive.template");
        }

        /**
         * Dependency provider for <b>compose</b> with <b>com.github.xiaojinzi123.AndroidReactive:reactive-template-compose</b> coordinates and
         * with version reference <b>xiaojinzi.android.reactive</b>
         * <p>
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
         * Dependency provider for <b>activitystack</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-activity-stack</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getActivitystack() {
            return create("xiaojinzi.android.support.activitystack");
        }

        /**
         * Dependency provider for <b>annotation</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-annotation</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotation() {
            return create("xiaojinzi.android.support.annotation");
        }

        /**
         * Dependency provider for <b>bean</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-bean</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBean() {
            return create("xiaojinzi.android.support.bean");
        }

        /**
         * Dependency provider for <b>compose</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-compose</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("xiaojinzi.android.support.compose");
        }

        /**
         * Dependency provider for <b>init</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-init</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getInit() {
            return create("xiaojinzi.android.support.init");
        }

        /**
         * Group of libraries at <b>xiaojinzi.android.support.ktx</b>
         */
        public XiaojinziAndroidSupportKtxLibraryAccessors getKtx() {
            return laccForXiaojinziAndroidSupportKtxLibraryAccessors;
        }

    }

    public static class XiaojinziAndroidSupportKtxLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public XiaojinziAndroidSupportKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-ktx</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("xiaojinzi.android.support.ktx");
        }

        /**
         * Dependency provider for <b>retrofit</b> with <b>com.github.xiaojinzi123.AndroidSupport:lib-ktx-retrofit</b> coordinates and
         * with version reference <b>xiaojinzi.android.support</b>
         * <p>
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
         * Version alias <b>agp</b> with value <b>8.5.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAgp() { return getVersion("agp"); }

        /**
         * Version alias <b>compileSdk</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompileSdk() { return getVersion("compileSdk"); }

        /**
         * Version alias <b>compose</b> with value <b>1.7.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("compose"); }

        /**
         * Version alias <b>glance</b> with value <b>1.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGlance() { return getVersion("glance"); }

        /**
         * Version alias <b>hilt</b> with value <b>2.51.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHilt() { return getVersion("hilt"); }

        /**
         * Version alias <b>junit</b> with value <b>4.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>kcomponent</b> with value <b>v1.0.8-rc7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKcomponent() { return getVersion("kcomponent"); }

        /**
         * Version alias <b>koin</b> with value <b>3.5.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKoin() { return getVersion("koin"); }

        /**
         * Version alias <b>kotlin</b> with value <b>1.9.23</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("kotlin"); }

        /**
         * Version alias <b>ksp</b> with value <b>1.9.0-1.0.13</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKsp() { return getVersion("ksp"); }

        /**
         * Version alias <b>lifecycle</b> with value <b>2.8.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLifecycle() { return getVersion("lifecycle"); }

        /**
         * Version alias <b>lottie</b> with value <b>6.5.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLottie() { return getVersion("lottie"); }

        /**
         * Version alias <b>material</b> with value <b>1.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMaterial() { return getVersion("material"); }

        /**
         * Version alias <b>minSdk</b> with value <b>21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMinSdk() { return getVersion("minSdk"); }

        /**
         * Version alias <b>retrofit</b> with value <b>2.11.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRetrofit() { return getVersion("retrofit"); }

        /**
         * Version alias <b>room</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRoom() { return getVersion("room"); }

        /**
         * Version alias <b>targetSdk</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTargetSdk() { return getVersion("targetSdk"); }

        /**
         * Group of versions at <b>versions.androidx</b>
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.espresso</b>
         */
        public EspressoVersionAccessors getEspresso() {
            return vaccForEspressoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.work</b>
         */
        public WorkVersionAccessors getWork() {
            return vaccForWorkVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.xiaojinzi</b>
         */
        public XiaojinziVersionAccessors getXiaojinzi() {
            return vaccForXiaojinziVersionAccessors;
        }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.androidx.test</b>
         */
        public AndroidxTestVersionAccessors getTest() {
            return vaccForAndroidxTestVersionAccessors;
        }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  {

        private final AndroidxTestExtVersionAccessors vaccForAndroidxTestExtVersionAccessors = new AndroidxTestExtVersionAccessors(providers, config);
        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.androidx.test.ext</b>
         */
        public AndroidxTestExtVersionAccessors getExt() {
            return vaccForAndroidxTestExtVersionAccessors;
        }

    }

    public static class AndroidxTestExtVersionAccessors extends VersionFactory  {

        public AndroidxTestExtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>androidx.test.ext.junit</b> with value <b>1.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("androidx.test.ext.junit"); }

    }

    public static class EspressoVersionAccessors extends VersionFactory  {

        public EspressoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>espresso.core</b> with value <b>3.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("espresso.core"); }

    }

    public static class WorkVersionAccessors extends VersionFactory  {

        public WorkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>work.manager</b> with value <b>2.9.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getManager() { return getVersion("work.manager"); }

    }

    public static class XiaojinziVersionAccessors extends VersionFactory  {

        private final XiaojinziAndroidVersionAccessors vaccForXiaojinziAndroidVersionAccessors = new XiaojinziAndroidVersionAccessors(providers, config);
        public XiaojinziVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.xiaojinzi.android</b>
         */
        public XiaojinziAndroidVersionAccessors getAndroid() {
            return vaccForXiaojinziAndroidVersionAccessors;
        }

    }

    public static class XiaojinziAndroidVersionAccessors extends VersionFactory  {

        public XiaojinziAndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>xiaojinzi.android.module</b> with value <b>v1.0-beta50</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getModule() { return getVersion("xiaojinzi.android.module"); }

        /**
         * Version alias <b>xiaojinzi.android.reactive</b> with value <b>d21ecebff9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getReactive() { return getVersion("xiaojinzi.android.reactive"); }

        /**
         * Version alias <b>xiaojinzi.android.support</b> with value <b>v1.0-beta224</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
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
         * Group of plugins at <b>plugins.android</b>
         */
        public AndroidPluginAccessors getAndroid() {
            return paccForAndroidPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.hilt</b>
         */
        public HiltPluginAccessors getHilt() {
            return paccForHiltPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.kotlin</b>
         */
        public KotlinPluginAccessors getKotlin() {
            return paccForKotlinPluginAccessors;
        }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>android.application</b> with plugin id <b>com.android.application</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

        /**
         * Plugin provider for <b>android.library</b> with plugin id <b>com.android.library</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

    }

    public static class HiltPluginAccessors extends PluginFactory {

        public HiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>hilt.android</b> with plugin id <b>com.google.dagger.hilt.android</b> and
         * with version reference <b>hilt</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroid() { return createPlugin("hilt.android"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>kotlin.android</b> with plugin id <b>org.jetbrains.kotlin.android</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroid() { return createPlugin("kotlin.android"); }

    }

}

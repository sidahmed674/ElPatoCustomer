plugins { alias(libs.plugins.android.application); alias(libs.plugins.kotlin.android); alias(libs.plugins.kotlin.compose); alias(libs.plugins.kotlin.serialization); alias(libs.plugins.hilt) }
android {
    namespace = "com.elpato.customer"; compileSdk = 34
    defaultConfig { applicationId = "com.elpato.customer"; minSdk = 24; targetSdk = 34; versionCode = 1; versionName = "1.0.0"; testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"; vectorDrawables { useSupportLibrary = true } }
    buildTypes { release { isMinifyEnabled = true; proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") } }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17"; freeCompilerArgs += listOf("-Xopt-in=kotlin.RequiresOptIn", "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi", "-Xopt-in=androidx.compose.material3.ExperimentalMaterial3Api") }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.14" }
    packagingOptions { resources { excludes += "META-INF/*.kotlin_module" } }
    buildFeatures { compose = true; viewBinding = true }
}
dependencies {
    implementation(libs.androidx.core.ktx); implementation(libs.androidx.lifecycle.runtime.ktx); implementation(libs.androidx.activity.compose); implementation(libs.androidx.activity.ktx); implementation(libs.androidx.fragment.ktx)
    implementation(platform(libs.compose.bom)); implementation(libs.compose.ui); implementation(libs.compose.material3); implementation(libs.compose.navigation); implementation(libs.compose.runtime)
    implementation(libs.accompanist.permissions); implementation(libs.accompanist.systemuicontroller)
    implementation(libs.hilt.android); implementation(libs.hilt.navigation.compose); kapt(libs.hilt.compiler)
    implementation(libs.retrofit); implementation(libs.retrofit.moshi); implementation(libs.okhttp); implementation(libs.okhttp.logging); implementation(libs.moshi); implementation(libs.moshi.kotlin)
    implementation(libs.kotlinx.serialization.json); implementation(libs.coil)
    implementation(libs.room.runtime); implementation(libs.room.ktx); kapt(libs.room.compiler)
    implementation(libs.datastore.preferences); implementation(libs.coroutines.android)
    implementation(libs.maps.compose); implementation(libs.play.services.maps); implementation(libs.play.services.location); implementation(libs.places.sdk)
    implementation(platform(libs.firebase.bom)); implementation(libs.firebase.messaging); implementation(libs.firebase.analytics); implementation(libs.firebase.crashlytics)
    implementation(libs.workmanager)
    testImplementation(libs.junit); androidTestImplementation(libs.espresso); androidTestImplementation(platform(libs.compose.bom)); androidTestImplementation(libs.compose.test); kaptAndroidTest(libs.hilt.compiler)
}
kapt { correctErrorTypes = true; arguments { arg("hilt.codegen.output", "generated") } }

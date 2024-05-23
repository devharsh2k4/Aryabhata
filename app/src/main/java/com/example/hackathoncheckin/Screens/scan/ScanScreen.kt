package com.example.hackathoncheckin.Screens.scan

import android.Manifest
import android.content.pm.PackageManager
import android.util.Size
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScanScreen(navController: NavHostController = rememberNavController()){
    var code by remember{
        mutableStateOf("")
    }
    val context = LocalContext.current
    val cameraProviderFuture = remember{
        ProcessCameraProvider.getInstance(context)
    }

    var hasCameraPermissions by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.CAMERA

            )== PackageManager.PERMISSION_GRANTED
        )
    }
    val launcher =  rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted ->
            hasCameraPermissions = granted
        }
    )
    LaunchedEffect(key1 = true) {
        launcher.launch(Manifest.permission.CAMERA)
    }
    Text(text = "Scan Screen")

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
//        AndroidView(factory = { context ->
//            val previewView = PreviewView(context)
//            val preview = Preview.Builder().build()
//            val selector = CameraSelector.Builder()
//                .requireLensFacing(CameraSelector.LENS_FACING_BACK)
//                .build()
//            preview.setSurfaceProvider(previewView.surfaceProvider)
//            val imageAnalysis = ImageAnalysis.Builder()
//                .setTargetResolution(
//                    Size(
//                        previewView.width,
//                        previewView.height
//                    ))
//                .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
//                .build()
//
//        })

    }
}
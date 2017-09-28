package com.squareup.sqldelight.core.configuration

data class Configuration(
    val variantName: String,
    val dependencies: List<String>,
    val packageName: String
)
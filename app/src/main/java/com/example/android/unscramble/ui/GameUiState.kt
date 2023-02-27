package com.example.android.unscramble.ui
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// Game UI state
data class GameUiState(
    val currentScrambledWord: String = ""
)

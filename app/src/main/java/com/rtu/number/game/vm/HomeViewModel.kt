package com.rtu.number.game.vm

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val mainState = _uiState.asStateFlow()

    val possibleButtonContainerColors = listOf(
        Color.Companion.Blue,
        Color.Companion.Red,
        Color.Companion.Green,
        Color.Companion.Yellow,
    )

    val randomButtonColor: Color
        get() {
            return possibleButtonContainerColors.random()
        }

    fun onTestButtonClick() {
        _uiState.update {
            it.copy(
                buttonBackGroundColor = randomButtonColor
            )
        }
    }

    @Stable
    data class UiState(
        val buttonBackGroundColor: Color = Color.Companion.Blue,
    )
}
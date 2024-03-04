package com.roland.android.capsule.data

import com.roland.android.data.data_source.questions
import com.roland.android.data.states.QuizResult
import com.roland.android.data.states.TimeState
import com.roland.android.domain.entity.Question

data class UiState(
	val quizQuestions: MutableList<Question> = questions,
	val currentQuestion: Question = quizQuestions[0],
	val result: QuizResult? = null,
	val quizHalfFinished: Boolean = false,
	val time: TimeState = TimeState(),
	val quizStarted: Boolean = false,
)
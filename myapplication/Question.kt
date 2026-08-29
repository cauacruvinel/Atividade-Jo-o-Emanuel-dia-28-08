package com.example.appquiz

import androidx.annotation.StringRes

/**
 * Representa uma pergunta do quiz no domínio da aplicação.
 *
 * Esta classe concentra os dados mínimos necessários para renderizar uma questão
 * na interface e validar a resposta do usuário.
 *
 * @property textResId identificador de recurso de texto (string) do enunciado.
 * @property answer valor booleano correto esperado para a pergunta.
 */
data class Question(
    @StringRes val textResId: Int,
    val answer: Boolean
)

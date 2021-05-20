package com.intellij.plugin.gamification.widget

import java.awt.BorderLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JPasswordField
import javax.swing.JTextField

class SignInPanel {

    val signPanel = JPanel()

    companion object {
        private const val fieldSize = 20
    }

    init {
//        signInPanel.layout = GridLayout()

        val lbLogin = JLabel("Login: ")
        signPanel.add(lbLogin, BorderLayout.NORTH)

        val tfUsername = JTextField(fieldSize)
        signPanel.add(tfUsername, BorderLayout.NORTH)
        val lbPassword = JLabel("Password: ")
        signPanel.add(lbPassword, BorderLayout.SOUTH)

        val pfPassword = JPasswordField(fieldSize)
        signPanel.add(pfPassword, BorderLayout.SOUTH)

//        signInPanel.layout = GridLayout(0, 2, 10, 10)

//        signInPanel.border = LineBorder(Color.GREEN)

        val btnLogin = JButton("Login")

        btnLogin.addActionListener {
            println("login" + tfUsername.text + " password " + pfPassword.password)
        }

        signPanel.add(btnLogin)
    }
}

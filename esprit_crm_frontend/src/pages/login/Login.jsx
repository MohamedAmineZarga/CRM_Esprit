import "./login.scss"
import React from 'react';
const { Component } = React

class Login extends Component {
  constructor(props){
    super(props)
    this.state = {
      currentView: "signUp"
    }
  }

  changeView = (view) => {
    this.setState({
      currentView: view
    })
  }

  currentView = () => {
    switch(this.state.currentView) {
      case "signUp":
        return (
          <form>
            <h2>S'inscrire</h2>
            <fieldset>
              <legend>Créez votre compte</legend>
              <ul>
                <li>
                  <label for="username">Nom d'utilisateur:</label>
                  <input type="text" id="username" required/>
                </li>
                <li>
                  <label for="email">Email:</label>
                  <input type="email" id="email" required/>
                </li>
                <li>
                  <label for="password">Mot de passe:</label>
                  <input type="password" id="password" required/>
                </li>
              </ul>
            </fieldset>
            <button>Se connécter</button>
            <button type="button" onClick={ () => this.changeView("logIn")}>Vous avez déja un compte ? <br></br>Connectez-vous !</button>
          </form>
        )
        break
      case "logIn":
        return (
          <form>
            <h2>Bienvenue!</h2>
            <fieldset>
              <legend>Se Connécter</legend>
              <ul>
                <li>
                  <label for="username">Email:</label>
                  <input type="email" id="email" required/>
                </li>
                <li>
                  <label for="password">Mot de passe:</label>
                  <input type="password" id="password" required/>
                </li>
                <li>
                  <i/>
                  <a onClick={ () => this.changeView("PWReset")} href="#">Mot de passe Oublié ?</a>
                </li>
              </ul>
            </fieldset>
            <button>Connexion</button>
            <button type="button" onClick={ () => this.changeView("signUp")}>Créer un compte</button>
          </form>
        )
        break
      case "PWReset":
        return (
          <form>
          <h2>Récupérez votre mot de passe</h2>
          <fieldset>
            <legend>Password Reset</legend>
            <ul>
              <li>
                <em>Vous receverez un email</em>
              </li>
              <li>
                <label for="email">Email:</label>
                <input type="email" id="email" required/>
              </li>
            </ul>
          </fieldset>
          <button>Recevoir le lien de récupération</button>
          <button type="button" onClick={ () => this.changeView("logIn")}>Retour</button>
        </form>
        )
      default:
        break
    }
  }


  render() {
    return (
      <section id="entry-page">
        {this.currentView()}
      </section>
    )
  }
}

export default Login
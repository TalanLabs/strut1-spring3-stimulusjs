import { Application } from "stimulus"
import { definitionsFromContext } from "stimulus/webpack-helpers"

//import 'purecss/build/pure.css'

import 'bulma/css/bulma.css'

const application = Application.start()
const context = require.context("./controllers", true, /\.js$/)
application.load(definitionsFromContext(context))

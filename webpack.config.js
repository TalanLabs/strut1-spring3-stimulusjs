

const path = require('path');

const MiniCssExtractPlugin = require('mini-css-extract-plugin');


module.exports = {
  entry: './src/main/webapp/app/main.js',
  output: {
    path: path.resolve(__dirname, './src/main/webapp/build/'),
    filename: 'app-bundle.js'
  },
  plugins: [new MiniCssExtractPlugin(
    {
      filename: 'bulma.css', 
    }
  )],
  module: {
    rules: [
      {
        test: /\.css$/,
        use: [MiniCssExtractPlugin.loader, 'css-loader'],
      },
    ],
  },
};


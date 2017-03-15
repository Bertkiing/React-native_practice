import React, { Component } from 'react'
import { AppRegistry, Text, Image, StyleSheet, Text, View } from 'react-native'

class HelloWorldApp extends Component {
  render () {
    var movie = MOCKED_MOVIED_DATA[0]
    return (
      <View style={styles.container}>
        <Text>
          {movie.title}
        </Text>
        <Text>
          {movie.year}
        </Text>
        <Image source={{uri: movie.posters.thumbnail}} />
      </View>
    )
  }
}

var styles = StyleSheet.create(
    container{
        flex:1,
        justifyContent:'center',
        alignItems:'center',
        backgroundColor:'#f5fcff',
    }

);



AppRegistry.registerComponent('HelloWorldApp', () => HelloWorldApp)

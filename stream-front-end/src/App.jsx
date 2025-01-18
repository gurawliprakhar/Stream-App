import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import VideoUpload from './components/VideoUpload'

function App() {
  const [count, setCount] = useState(0)
  const [videoId, setVideoId] = useState('06d68d31-ec63-4af1-96e9-88f12a90b949')

  return (
    <>
      <div className='flex flex-col items-center space-y-9 justify-center py-9'>
        <h1 className="text-5xl font-extrabold text-gray-700 dark:text-gray-100">
           welcome to video streaming application </h1>

      <div>
          <h1 className='text-white'>Playing Video </h1>
          <video src = {`http://localhost:8080/api/v1/videos/stream/${videoId}`}  controls ></video>
        </div>

      <VideoUpload/>
      </div>
    </>
  )
}

export default App

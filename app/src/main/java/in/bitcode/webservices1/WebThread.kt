package `in`.bitcode.webservices1

import android.util.Log
import java.io.File
import java.net.URL

class WebThread : Thread() {

    override fun run() {
        //val url = URL("https://bitcode.in")
        val url = URL("https://bitcode.in/images/getfirstjob/get_first_job_as_fresher_pune_bitcode.jpg")
        val httpURLConnection = url.openConnection()

        httpURLConnection.connect()

        Log.e("tag", "Response encoding: ${httpURLConnection.contentEncoding}" )
        Log.e("tag", "Response length: ${httpURLConnection.contentLength}" )
        Log.e("tag", "Response type: ${httpURLConnection.contentType}" )

        val inStream = httpURLConnection.getInputStream()

        val responseBuffer = StringBuffer()
        val data = ByteArray(1024 * 1)
        var count = 0

        count = inStream.read(data)
        while (count != -1) {
            responseBuffer.append(String(data, 0, count))
            count = inStream.read(data)
        }
        inStream.close()

        Log.e("tag", responseBuffer.toString())
    }
}
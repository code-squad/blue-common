import Foundation

let text = try?String(contentsOfFile: "hello.txt", encoding: String.Encoding.utf8)

print(text!)

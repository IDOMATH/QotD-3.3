package qotd

class Quote
{
    String content
    String author
    Date created = new Date()

    static constraints =
    {
        author(black: false)
        content(maxSize:1000, black:false)
    }
}

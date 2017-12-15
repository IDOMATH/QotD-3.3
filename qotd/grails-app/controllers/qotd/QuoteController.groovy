package qotd

class QuoteController
{
    static defaultAction = "random"

    static scaffold = Quote

    def quoteService

    def random =
    {
        def randomQuote = quoteService.getRandomQuote()
        [ quote : randomQuote]
    }

    def ajaxRandom()
    {
      def randomQuote = quoteService.getRandomQuote()
      render
      {
        q(randomQuote.content)
        p(randomQuote.author)
      }
    }
}

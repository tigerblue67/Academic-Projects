FROM ruby:2.7.2
RUN apt-get update -qq && apt-get install -y nodejs postgresql-client
RUN gem install rails bundler
COPY . /square
RUN cd /square/square
WORKDIR /square/square
RUN bundle update

EXPOSE 3000

# Start the main process.
CMD ["rails", "server", "-b", "0.0.0.0"]
#FROM rails:onbuild
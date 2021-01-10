FROM python:latest
RUN mkdir -p /app
COPY . /app
RUN make /app
WORKDIR /app
EXPOSE 80

CMD python main.py
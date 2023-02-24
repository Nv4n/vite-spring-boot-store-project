# Declare the base image
FROM node:19-alpine
WORKDIR /app/frontend/

# Build step
COPY package*.json .

# Install dependencies
RUN yarn

# Copy the source code to WORKDIR dir
COPY . .

# Expose port on the container
EXPOSE 3000

# run the app
CMD ["yarn", "dev"]